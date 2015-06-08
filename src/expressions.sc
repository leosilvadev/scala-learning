object expressions {
  
	val a = 5                                 //> a  : Int = 5

  if (a < 9) 4 else ()                            //> res0: AnyVal = 4
  if (a < 9) 4 else ""                            //> res1: Any = 4

	a match {
		case 0 => "Zero"
		case 1 => "One"
		case 2 => "Two"
		case x => "Number ("+x+") not permitted"
	}                                         //> res2: String = Number (5) not permitted
	
	
	val name = "Learning Scala"               //> name  : String = Learning Scala
	
	name match {
		case "Learning Scala" => "That's OK!"
		case _ 	  => "Not OK!"
	}                                         //> res3: String = That's OK!
	
	val pattern = "^Scala".r                  //> pattern  : scala.util.matching.Regex = ^Scala
	val str = "I really Enjoy Scala programming! :)"
                                                  //> str  : String = I really Enjoy Scala programming! :)
  println(pattern findFirstIn str)                //> None
	
}