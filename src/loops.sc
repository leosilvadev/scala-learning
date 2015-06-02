object loops {

	var num = 0                               //> num  : Int = 0
	while(num<5){
		println(num)
		num += 1
		//Does not work, because += is a function, ++ is not...
		//num++
	}                                         //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
     
  //Does not generate an output... :(
	1 until 5                                 //> res0: scala.collection.immutable.Range = Range(1, 2, 3, 4)
	for(it <- 1 to 5) println(it)             //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
	//Now it give us an output! :D
	for(it <- 1 until 5) yield it * it        //> res1: scala.collection.immutable.IndexedSeq[Int] = Vector(1, 4, 9, 16)

}