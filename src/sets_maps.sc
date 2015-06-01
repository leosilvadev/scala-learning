object sets_maps {
  val imSet = Set(1, 2, 3)                        //> imSet  : scala.collection.immutable.Set[Int] = Set(1, 2, 3)
	val imSet2 = imSet + 4                    //> imSet2  : scala.collection.immutable.Set[Int] = Set(1, 2, 3, 4)
	imSet                                     //> res0: scala.collection.immutable.Set[Int] = Set(1, 2, 3)

	val mulSet = collection.mutable.Set(1,2,3,4)
                                                  //> mulSet  : scala.collection.mutable.Set[Int] = Set(1, 2, 3, 4)
  mulSet += 5                                     //> res1: sets_maps.mulSet.type = Set(1, 5, 2, 3, 4)
	mulSet                                    //> res2: scala.collection.mutable.Set[Int] = Set(1, 5, 2, 3, 4)

	//Initialize using tuples
	val imMap = Map(("user", "Leonardo"))     //> imMap  : scala.collection.immutable.Map[String,String] = Map(user -> Leonard
                                                  //| o)
  //Initialize using cool tuples :)
  val imCoolMap = Map("user"->"Leonardo")         //> imCoolMap  : scala.collection.immutable.Map[String,String] = Map(user -> Leo
                                                  //| nardo)

}