package regex

/**
 * @author leonardo
 */
object PhoneRegex extends App {

  val pattern = """\((\d\d)\) (\d\d\d\d)-(\d\d\d\d)""".r
  val phones = """Leonardo  (12) 1231-3123
                  John      (12) 4123-4123
                  Jay       (12) 5123-1232"""

  pattern.findAllMatchIn(phones) map { string =>
    Phone(string.group(0), string.group(1) + string.group(2))
  } foreach { phone => println(phone.xml) }

  val listPhones = List("(12) 1212-1212", "(13) 2323-2323", "(14) 3434-3434")
  for(pattern(ddd, first, last) <- listPhones) {
    println(s"DDD: ${ddd}")
    println(s"First: ${first}")
    println(s"Last: ${last}\n\n")
  }

}

case class Phone(areaCode: String, number: String) {

  def xml = {
    <phone areaCode={areaCode} number={number}/>
  }
  
}