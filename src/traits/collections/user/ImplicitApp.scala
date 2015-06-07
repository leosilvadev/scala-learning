package traits.collections.user

object ImplicitApp extends App {

  implicit def convert(number:Int) = CrazyInt(number)
  
  println( 10 ++ 20 ++ 30 ++ 40 ++ 50 )
  
}

case class CrazyInt(value:Int) {
  def ++(number: CrazyInt) = {
    CrazyInt(number.toInt + value)
  }
  
  def toInt = value
}