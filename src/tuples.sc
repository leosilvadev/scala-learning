object tuples {
  val (name, lastname, alias) = ("Leonardo", "Silva", "leosilvadev")
                                                  //> name  : String = Leonardo
                                                  //| lastname  : String = Silva
                                                  //| alias  : String = leosilvadev
  ("John", "Obzis", "jhobzis")                    //> res0: (String, String, String) = (John,Obzis,jhobzis)

  val (word, times) = ("Abcd", 10)                //> word  : String = Abcd
                                                  //| times  : Int = 10

  val (n1, n2, n3) = (1, 2, 3)                    //> n1  : Int = 1
                                                  //| n2  : Int = 2
                                                  //| n3  : Int = 3

  var result = (4, 5, 6) match {
    case (4, 6, _) => "That's OK!"
    case (_, 5, 7) => "Well, that's already OK!"
    case tuple     => s"Right, not OK now! No case matches: $tuple"
  }                                               //> result  : String = Right, not OK now! No case matches: (4,5,6)

  //Passing val to a match
  val option = 10                                 //> option  : Int = 10
  val number = 10                                 //> number  : Int = 10
  var resultOption = number match {
    case 1        => "It's one!"
    case `option` => s"It's the same of option ($option) value!"
    case _        => s"It's NOT the same of option ($option) value!"
  }                                               //> resultOption  : String = It's the same of option (10) value!
}