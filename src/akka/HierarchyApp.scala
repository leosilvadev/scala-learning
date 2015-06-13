package akka

import akka.actor.Actor
import akka.actor.Props
import akka.actor.ActorSystem
import akka.actor.OneForOneStrategy
import akka.actor.SupervisorStrategy._

/**
 * @author leonardo
 */
object HierarchyApp extends App {

  case object Throw
  case object CascadeMessage
  case object SimpleMessage

  class ParentActor extends Actor {
    override def preStart() = {
      context.actorOf(Props[ChildActor], "childOne")
      context.actorOf(Props[ChildActor], "childTwo")
      context.actorOf(Props[ChildActor], "childThree")
    }

    def receive = {
      case CascadeMessage =>
        println("Parent")
        context.children.foreach { _ ! SimpleMessage }
    }
    
    override val supervisorStrategy = OneForOneStrategy(loggingEnabled = false) {
      case ex:Exception =>
        println("Child had an exception")
        Restart
    }
  }

  class ChildActor extends Actor {
    def receive = {
      case CascadeMessage =>
        println("Child Cascade")
        context.parent ! CascadeMessage
        
      case Throw => 
        println("Child Dying")
        throw new Exception("Something bad happened.")
        
      case SimpleMessage =>
        println("Child Simple " + self.path)
    }

    override def preStart() = {
      super.preStart
      println("Prestart")
    }
    override def postStop() = {
      super.postStop
      println("Poststop")
    }
    override def preRestart(reason: Throwable, message: Option[Any]) = {
      super.preRestart(reason, message)
      println("Prerestart " + message)
    }
    override def postRestart(reason: Throwable) = {
      super.postRestart(reason)
      println("Postrestart")
    }
  }

  val system = ActorSystem("HierarchySystem")
  val actorOne = system.actorOf(Props[ParentActor], "parentOne")
  val actorTwo = system.actorOf(Props[ParentActor], "parentTwo")

  val childOne = system.actorSelection("akka://HierarchySystem/user/parentOne/childOne")
  val childTwo = system.actorSelection("/user/parentTwo/childTwo")

  childTwo ! Throw
  
  Thread.sleep(1000)

  childOne ! CascadeMessage
  childTwo ! CascadeMessage
  
  //  system.shutdown

}