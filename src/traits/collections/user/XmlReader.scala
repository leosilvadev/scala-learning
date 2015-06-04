package traits.collections.user

object XmlReader extends App {

  val xmlFile = xml.XML.loadFile("map.xml")
  //You can go entering inside the xml tree by this :)
  (xmlFile \ "room" \ "item") foreach { row =>
    println(row)
  }
  
}