package game

/**
 * @author leonardo
 */
case class Game(configFile: String) {
  
  val users = xml.XML.loadFile(configFile)
  
  def damageItems = {
    val damageItems = users \\ "item" filter { item =>
      (item \ "@category").text == "damage" 
    } map { Item(_) }
    damageItems
  }
  
  def saveXML(filename: String) {
    xml.XML.save(filename, users)
  }
  
}