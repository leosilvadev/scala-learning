object tuples {
  val (name, lastname, alias) = ("Leonardo", "Silva", "leosilvadev")
                                                  //> name  : String = Leonardo
                                                  //| lastname  : String = Silva
                                                  //| alias  : String = leosilvadev
 ("John", "Obzis", "jhobzis")                     //> res0: (String, String, String) = (John,Obzis,jhobzis)
 
 val (word, times) = ("Abcd", 10)                 //> word  : String = Abcd
                                                  //| times  : Int = 10
 
 val (n1, n2, n3) = (1, 2, 3)                     //> n1  : Int = 1
                                                  //| n2  : Int = 2
                                                  //| n3  : Int = 3
 
 
 var result = (4,5,6) match {
 	case (4, 6, _) => "That's OK!"
 	case (_, 5, 7) => "Well, that's already OK!"
 	case _ => "Right, not OK now!"
 }                                                //> result  : String = Right, not OK now!
 
 
}