package akka

import akka.actor.ActorSystem
import akka.actor.Actor
import akka.actor.Props


/**
 * @author leonardo
 */
object MessagesApp extends App {
  
  class MessageActor extends Actor {
    def receive = {
      case s:String => println(s"The message is a String: ${s}")
      case i:Int => println(s"The message is a Int: ${i}")
      case _ => println(s"The message is a unknown type")
    }
  }
  
  val system = ActorSystem("MessageSystem")
  val actor = system.actorOf(Props[MessageActor], "MessageActor")
  
  actor ! "MyString"
  actor ! 10
  actor ! List("abc")
  
  system.shutdown
}