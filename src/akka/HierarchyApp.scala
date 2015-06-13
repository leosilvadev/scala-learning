package akka

import akka.actor.Actor
import akka.actor.Props
import akka.actor.ActorSystem

/**
 * @author leonardo
 */
object HierarchyApp extends App {
  
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
  }
  
  
  class ChildActor extends Actor {
    def receive = {
      case CascadeMessage =>
        println("Child Cascade")
        context.parent ! CascadeMessage
        
      case SimpleMessage =>
        println("Child Simple "+self.path)
    }
  }
  
  val system = ActorSystem("HierarchySystem")
  val actorOne = system.actorOf(Props[ParentActor], "parentOne")
  val actorTwo = system.actorOf(Props[ParentActor], "parentTwo")
  
  val childOne = system.actorSelection("akka://HierarchySystem/user/parentOne/childOne")
  val childTwo = system.actorSelection("/user/parentTwo/childTwo")  
  
  childOne ! CascadeMessage
  childTwo ! CascadeMessage
  
//  system.shutdown
  
}