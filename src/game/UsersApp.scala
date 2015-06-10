package game

import io.StdIn._

object UserApp extends App {
  
  val damageItems = Game("users.xml").damageItems
  println(damageItems)
  
  val xmlItems = damageItems map { _.xml }
  println(xmlItems)
  
}
