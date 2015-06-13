package akka

import akka.actor.Actor
import akka.actor.ActorRef
import akka.actor.ActorSystem
import akka.actor.Props

/**
 * @author leonardo
 */
object Counter extends App {

  case class StartCount(number: Int, counter: ActorRef)
  case class Count(number: Int)

  class CounterActor extends Actor {
    def receive = {
      case StartCount(number, counter) =>
        counter ! Count(number)

      case Count(number) =>
        if (number > 0) {
          println(number)
          Thread.sleep(1000)
          sender ! Count(number - 1)

        } else {
          context.system.shutdown
        }
    }
  }
  
  val system = ActorSystem("CounterSystem")
  val actorOne = system.actorOf(Props[CounterActor], "ActorOne")
  val actorTwo = system.actorOf(Props[CounterActor], "ActorTwo")

  actorOne ! StartCount(10, actorTwo)
  
}