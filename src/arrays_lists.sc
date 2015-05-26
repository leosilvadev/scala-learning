object arrays_lists {

	//Array is mutable
	val array = Array(1, 2, 3, 4)             //> array  : Array[Int] = Array(1, 2, 3, 4)
	array(0) = 1
	
	//List is not mutable, so you cannot add or remove
	val list = List(5, 6, 7, 8)               //> list  : List[Int] = List(5, 6, 7, 8)
	//list(0) = 1
	
	//But you can prepend, in this case you get another List
	//with the value of list + prepend
	val newList = 2::list                     //> newList  : List[Int] = List(2, 5, 6, 7, 8)

	list                                      //> res0: List[Int] = List(5, 6, 7, 8)

}