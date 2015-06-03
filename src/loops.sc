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


	for(it <- 1 until 3; it2 <- 1 to 2) yield (it, it2)
                                                  //> res2: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((1,1), (1,2
                                                  //| ), (2,1), (2,2))
	for(x <- 1 to 5 ; y <- 1 until 5 ; w = x*y ) yield (x,y,w)
                                                  //> res3: scala.collection.immutable.IndexedSeq[(Int, Int, Int)] = Vector((1,1,1
                                                  //| ), (1,2,2), (1,3,3), (1,4,4), (2,1,2), (2,2,4), (2,3,6), (2,4,8), (3,1,3), (
                                                  //| 3,2,6), (3,3,9), (3,4,12), (4,1,4), (4,2,8), (4,3,12), (4,4,16), (5,1,5), (5
                                                  //| ,2,10), (5,3,15), (5,4,20))
     
  for {
  	x <- 1 to 5
  	if (x%2==0)
  		y <- 5 to 10
  	
  } yield (x,y)                                   //> res4: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,5), (2,6
                                                  //| ), (2,7), (2,8), (2,9), (2,10), (4,5), (4,6), (4,7), (4,8), (4,9), (4,10))
}