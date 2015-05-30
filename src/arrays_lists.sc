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
  
	myArray(util.Random.nextInt(10))          //> res1: Array[Int] = Array(5, 5, 5)
	
	
	//Now the parameter is get as a function, so it executes the function, so number is a call
	//to the function passed and evaluate every time it is called!
	def funcArray(number: => Int): Array[Int] = Array(number, number, number)
                                                  //> funcArray: (number: => Int)Array[Int]
	funcArray(util.Random.nextInt(10))        //> res2: Array[Int] = Array(2, 6, 0)
	
	//Creates a Array with a range with the number of numbers based on first parameter
	//the second parameter accepts a function to be executed in every tabulate iteration
	val tabArray = Array.tabulate(10)(num => num * num)
                                                  //> tabArray  : Array[Int] = Array(0, 1, 4, 9, 16, 25, 36, 49, 64, 81)
	
	val (first,last) = tabArray.splitAt(4)    //> first  : Array[Int] = Array(0, 1, 4, 9)
                                                  //| last  : Array[Int] = Array(16, 25, 36, 49, 64, 81)
	first                                     //> res3: Array[Int] = Array(0, 1, 4, 9)
	
	last                                      //> res4: Array[Int] = Array(16, 25, 36, 49, 64, 81)
	
	
	
	
	
	val patchArray = Array.fill(10)(util.Random.nextInt(100))
                                                  //> patchArray  : Array[Int] = Array(49, 91, 69, 25, 99, 9, 80, 13, 43, 59)
	//Updating some values inside the array
	patchArray.patch(1, Array(1, 2, 3, 4), 4) //> res5: Array[Int] = Array(49, 1, 2, 3, 4, 9, 80, 13, 43, 59)
	
	//It generates a new array!
	patchArray                                //> res6: Array[Int] = Array(49, 91, 69, 25, 99, 9, 80, 13, 43, 59)

	
	
	
	val productArray = Array.fill(100)(util.Random.nextInt(100))
                                                  //> productArray  : Array[Int] = Array(44, 82, 37, 40, 25, 22, 45, 95, 26, 22, 
                                                  //| 67, 59, 75, 36, 69, 15, 83, 30, 92, 7, 88, 55, 95, 74, 36, 2, 6, 45, 5, 43,
                                                  //|  93, 18, 24, 10, 3, 70, 83, 83, 30, 69, 83, 20, 40, 56, 15, 46, 99, 1, 7, 8
                                                  //| 6, 14, 91, 35, 57, 60, 53, 50, 60, 74, 40, 44, 58, 93, 81, 69, 76, 54, 73, 
                                                  //| 97, 14, 88, 41, 97, 20, 92, 15, 83, 84, 30, 34, 22, 75, 3, 10, 72, 3, 47, 7
                                                  //| 5, 33, 91, 55, 32, 2, 67, 81, 21, 11, 20, 75, 82)
  val productArray2 = Array.fill(100)(util.Random.nextInt(100))
                                                  //> productArray2  : Array[Int] = Array(19, 44, 41, 67, 14, 55, 30, 48, 43, 13,
                                                  //|  95, 54, 12, 4, 0, 13, 31, 18, 31, 97, 61, 91, 67, 48, 66, 69, 99, 10, 83, 
                                                  //| 50, 21, 80, 24, 0, 70, 99, 93, 33, 78, 52, 80, 69, 68, 97, 14, 36, 76, 23, 
                                                  //| 40, 69, 62, 24, 4, 85, 89, 52, 69, 57, 56, 72, 23, 34, 52, 59, 21, 3, 39, 1
                                                  //| 2, 89, 15, 69, 78, 42, 94, 46, 74, 50, 13, 92, 40, 34, 81, 2, 13, 47, 31, 9
                                                  //| 0, 81, 75, 75, 44, 18, 37, 8, 29, 27, 81, 9, 60, 35)
	
	productArray.intersect(productArray2)     //> res7: Array[Int] = Array(44, 37, 40, 95, 67, 59, 75, 36, 69, 15, 83, 30, 92
                                                  //| , 55, 74, 2, 43, 93, 18, 24, 10, 3, 70, 69, 40, 56, 46, 99, 14, 91, 35, 57,
                                                  //|  60, 50, 44, 81, 69, 76, 54, 97, 14, 41, 97, 34, 75, 72, 47, 33, 67, 81, 21
                                                  //| )

	productArray.diff(productArray2)          //> res8: Array[Int] = Array(82, 25, 22, 45, 26, 22, 7, 88, 95, 36, 6, 45, 5, 8
                                                  //| 3, 83, 30, 83, 20, 15, 1, 7, 86, 53, 60, 74, 40, 58, 93, 73, 88, 20, 92, 15
                                                  //| , 83, 84, 30, 22, 3, 10, 3, 75, 91, 55, 32, 2, 11, 20, 75, 82)

	productArray.union(productArray2).distinct.sorted
                                                  //> res9: Array[Int] = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
                                                  //| 15, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 29, 30, 31, 32, 33, 34, 35, 36,
                                                  //|  37, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 50, 52, 53, 54, 55, 56, 57, 58
                                                  //| , 59, 60, 61, 62, 66, 67, 68, 69, 70, 72, 73, 74, 75, 76, 78, 80, 81, 82, 8
                                                  //| 3, 84, 85, 86, 88, 89, 90, 91, 92, 93, 94, 95, 97, 99)
 	val withIndex = productArray.zipWithIndex //> withIndex  : Array[(Int, Int)] = Array((44,0), (82,1), (37,2), (40,3), (25,
                                                  //| 4), (22,5), (45,6), (95,7), (26,8), (22,9), (67,10), (59,11), (75,12), (36,
                                                  //| 13), (69,14), (15,15), (83,16), (30,17), (92,18), (7,19), (88,20), (55,21),
                                                  //|  (95,22), (74,23), (36,24), (2,25), (6,26), (45,27), (5,28), (43,29), (93,3
                                                  //| 0), (18,31), (24,32), (10,33), (3,34), (70,35), (83,36), (83,37), (30,38), 
                                                  //| (69,39), (83,40), (20,41), (40,42), (56,43), (15,44), (46,45), (99,46), (1,
                                                  //| 47), (7,48), (86,49), (14,50), (91,51), (35,52), (57,53), (60,54), (53,55),
                                                  //|  (50,56), (60,57), (74,58), (40,59), (44,60), (58,61), (93,62), (81,63), (6
                                                  //| 9,64), (76,65), (54,66), (73,67), (97,68), (14,69), (88,70), (41,71), (97,7
                                                  //| 2), (20,73), (92,74), (15,75), (83,76), (84,77), (30,78), (34,79), (22,80),
                                                  //|  (75,81), (3,82), (10,83), (72,84), (3,85), (47,86), (75,87), (33,88), (91,
                                                  //| 89), (55,90), (32,91), (2,92), (67,93), (81,94), (21,95), (11,96), (20,97),
                                                  //|  (75,98), (82,99))
	withIndex.last._1                         //> res10: Int = 82

	productArray.diff(productArray2).distinct.sorted.mkString("The result is: [", " - ", "]")
                                                  //> res11: String = The result is: [1 - 2 - 3 - 5 - 6 - 7 - 10 - 11 - 15 - 20 -
                                                  //|  22 - 25 - 26 - 30 - 32 - 36 - 40 - 45 - 53 - 55 - 58 - 60 - 73 - 74 - 75 -
                                                  //|  82 - 83 - 84 - 86 - 88 - 91 - 92 - 93 - 95]
}