import java.util.Random

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

	val arrayOfNames = Array.fill(100)("Unknown")
                                                  //> arrayOfNames  : Array[String] = Array(Unknown, Unknown, Unknown, Unknown, Un
                                                  //| known, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknow
                                                  //| n, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, U
                                                  //| nknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unkno
                                                  //| wn, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, 
                                                  //| Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unkn
                                                  //| own, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown,
                                                  //|  Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unk
                                                  //| nown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown
                                                  //| , Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Un
                                                  //| known, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknow
                                                  //| n, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, Unknown, U
                                                  //| nknown, Unknown, Unknown
                                                  //| Output exceeds cutoff limit.
  
  //An method just like a Java one, that gets a simple evaluated paramenter
  def myArray(number: Int): Array[Int] = Array(number, number, number)
                                                  //> myArray: (number: Int)Array[Int]
  
	myArray(util.Random.nextInt(10))          //> res1: Array[Int] = Array(9, 9, 9)
	
	
	//Now the parameter is get as a function, so it executes the function, so number is a call
	//to the function passed and evaluate every time it is called!
	def funcArray(number: => Int): Array[Int] = Array(number, number, number)
                                                  //> funcArray: (number: => Int)Array[Int]
	funcArray(util.Random.nextInt(10))        //> res2: Array[Int] = Array(5, 4, 9)
}