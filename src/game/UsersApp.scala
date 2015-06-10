package game

import io.StdIn._

object UserApp extends App {
  
  val game = Game("users.xml")
  
  val damageItems = game.damageItems
  println(damageItems)
  
  val xmlItems = damageItems map { _.xml }
  println(xmlItems)
  
  game.saveXML("new_users.xml")
  
}
