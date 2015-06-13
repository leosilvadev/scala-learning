package akka

import akka.actor.Actor
import scala.util.Random
import akka.actor.ActorSystem
import akka.actor.Props
import akka.pattern.Patterns._
import scala.concurrent.ExecutionContext

/**
 * @author leonardo
 */
object QuestionApp extends App {
  
  case class Question(title:String)
  
  case class Answer(question:Question, result:Boolean=false)
  
  class Questionary extends Actor {
    def receive = {
      case q:Question => sender ! Answer(q, Random.nextBoolean())
      case _ => throw new RuntimeException("It is not a question!")
    }
  }
  
  val system = ActorSystem("QuestionSystem")
  val questionary = system.actorOf(Props[Questionary], "QuestionaryActor")
  
  val answer = ask(questionary, Question("Is that true?"), 1000)
  
  implicit val ec = system.dispatcher
  
  answer onSuccess {
    case a:Answer => println(s"The Answer of '${a.question.title}' is: ${a.result}")
      system.shutdown
      
    case _ => 
      println("Unknow result!")
      system.shutdown
  }
  
  answer.onFailure {
    case s => 
      println(s"Error! [${s}]")
      system.shutdown
  }
  
//  implicit val ec = system.dispatcher
//  
//  ask()
  
}