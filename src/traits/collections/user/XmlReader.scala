package traits.collections.user

object XmlReader extends App {

//  val xmlFile = xml.XML.loadFile("map.xml")
//  //You can go entering inside the xml tree by this :)
//  (xmlFile \ "room" \ "item" \ "@name") foreach { row =>
//    println(row)
//  }
  
  val v = "method param1 param2"
  val v2 = v.indexWhere(_.isWhitespace) match {
    case -1 => (v, "")
    case i => v.splitAt(i)
  }
  println(v2)
}