package game

/**
 * @author leonardo
 */

case class Item(itemType:String, name:String, power:Int, category:String) {
  
}

object Item {
  
  def apply(node:xml.Node):Item = {
    val itemType = (node \ "@type").text.trim
    val name =     (node \ "@name").text.trim
    val power =    (node \ "@power").text.toInt
    val category = (node \ "@category").text.trim
    Item(itemType, name, power, category)
  }
  
}