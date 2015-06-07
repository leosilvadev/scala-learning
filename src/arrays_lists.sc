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
  
	myArray(util.Random.nextInt(10))          //> res1: Array[Int] = Array(0, 0, 0)
	
	
	//Now the parameter is get as a function, so it executes the function, so number is a call
	//to the function passed and evaluate every time it is called!
	def funcArray(number: => Int): Array[Int] = Array(number, number, number)
                                                  //> funcArray: (number: => Int)Array[Int]
	funcArray(util.Random.nextInt(10))        //> res2: Array[Int] = Array(1, 6, 5)
	
	//Creates a Array with a range with the number of numbers based on first parameter
	//the second parameter accepts a function to be executed in every tabulate iteration
	val tabArray = Array.tabulate(10)(num => num * num)
                                                  //> tabArray  : Array[Int] = Array(0, 1, 4, 9, 16, 25, 36, 49, 64, 81)
	
	val (first,last) = tabArray.splitAt(4)    //> first  : Array[Int] = Array(0, 1, 4, 9)
                                                  //| last  : Array[Int] = Array(16, 25, 36, 49, 64, 81)
	first                                     //> res3: Array[Int] = Array(0, 1, 4, 9)
	
	last                                      //> res4: Array[Int] = Array(16, 25, 36, 49, 64, 81)
	
	
	
	
	
	val patchArray = Array.fill(10)(util.Random.nextInt(100))
                                                  //> patchArray  : Array[Int] = Array(70, 12, 73, 91, 91, 82, 10, 70, 1, 72)
	//Updating some values inside the array
	patchArray.patch(1, Array(1, 2, 3, 4), 4) //> res5: Array[Int] = Array(70, 1, 2, 3, 4, 82, 10, 70, 1, 72)
	
	//It generates a new array!
	patchArray                                //> res6: Array[Int] = Array(70, 12, 73, 91, 91, 82, 10, 70, 1, 72)

	
	
	
	val productArray = Array.fill(100)(util.Random.nextInt(100))
                                                  //> productArray  : Array[Int] = Array(7, 65, 59, 81, 32, 43, 43, 65, 14, 0, 94
                                                  //| , 66, 29, 38, 8, 26, 37, 50, 87, 5, 47, 33, 82, 44, 14, 46, 75, 53, 8, 62, 
                                                  //| 66, 63, 83, 67, 45, 50, 54, 19, 76, 33, 29, 5, 20, 80, 84, 34, 5, 77, 37, 5
                                                  //| 7, 18, 27, 92, 90, 58, 13, 9, 89, 89, 69, 80, 31, 44, 40, 76, 18, 34, 74, 7
                                                  //| 9, 65, 4, 60, 11, 64, 11, 50, 7, 29, 5, 56, 40, 92, 2, 42, 43, 94, 2, 14, 7
                                                  //| , 36, 26, 66, 4, 69, 15, 26, 47, 6, 90, 29)
  val productArray2 = Array.fill(100)(util.Random.nextInt(100))
                                                  //> productArray2  : Array[Int] = Array(8, 73, 89, 5, 11, 29, 51, 84, 88, 39, 9
                                                  //| , 55, 43, 47, 20, 1, 7, 14, 43, 57, 86, 60, 17, 97, 22, 27, 96, 43, 75, 7, 
                                                  //| 35, 70, 90, 22, 29, 86, 78, 40, 7, 82, 77, 91, 7, 67, 14, 16, 4, 89, 14, 89
                                                  //| , 31, 85, 85, 72, 39, 46, 23, 14, 29, 62, 21, 18, 59, 65, 15, 97, 75, 82, 1
                                                  //| 5, 85, 8, 26, 51, 74, 65, 34, 87, 45, 41, 13, 18, 41, 64, 34, 93, 20, 12, 4
                                                  //| 0, 7, 15, 84, 47, 72, 46, 10, 16, 76, 66, 91, 85)
	
	productArray.intersect(productArray2)     //> res7: Array[Int] = Array(7, 65, 59, 43, 43, 65, 14, 66, 29, 8, 26, 87, 5, 4
                                                  //| 7, 82, 14, 46, 75, 8, 62, 67, 45, 76, 29, 20, 84, 34, 77, 57, 18, 27, 90, 1
                                                  //| 3, 9, 89, 89, 31, 40, 18, 34, 74, 4, 60, 11, 64, 7, 29, 40, 43, 14, 7, 15, 
                                                  //| 47)

	productArray.diff(productArray2)          //> res8: Array[Int] = Array(81, 32, 0, 94, 38, 37, 50, 33, 44, 53, 66, 63, 83,
                                                  //|  50, 54, 19, 33, 5, 80, 5, 37, 92, 58, 69, 80, 44, 76, 79, 65, 11, 50, 5, 5
                                                  //| 6, 92, 2, 42, 94, 2, 36, 26, 66, 4, 69, 26, 6, 90, 29)

	productArray.union(productArray2).distinct.sorted
                                                  //> res9: Array[Int] = Array(0, 1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                                                  //|  16, 17, 18, 19, 20, 21, 22, 23, 26, 27, 29, 31, 32, 33, 34, 35, 36, 37, 38
                                                  //| , 39, 40, 41, 42, 43, 44, 45, 46, 47, 50, 51, 53, 54, 55, 56, 57, 58, 59, 6
                                                  //| 0, 62, 63, 64, 65, 66, 67, 69, 70, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 
                                                  //| 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 96, 97)
 	val withIndex = productArray.zipWithIndex //> withIndex  : Array[(Int, Int)] = Array((7,0), (65,1), (59,2), (81,3), (32,4
                                                  //| ), (43,5), (43,6), (65,7), (14,8), (0,9), (94,10), (66,11), (29,12), (38,13
                                                  //| ), (8,14), (26,15), (37,16), (50,17), (87,18), (5,19), (47,20), (33,21), (8
                                                  //| 2,22), (44,23), (14,24), (46,25), (75,26), (53,27), (8,28), (62,29), (66,30
                                                  //| ), (63,31), (83,32), (67,33), (45,34), (50,35), (54,36), (19,37), (76,38), 
                                                  //| (33,39), (29,40), (5,41), (20,42), (80,43), (84,44), (34,45), (5,46), (77,4
                                                  //| 7), (37,48), (57,49), (18,50), (27,51), (92,52), (90,53), (58,54), (13,55),
                                                  //|  (9,56), (89,57), (89,58), (69,59), (80,60), (31,61), (44,62), (40,63), (76
                                                  //| ,64), (18,65), (34,66), (74,67), (79,68), (65,69), (4,70), (60,71), (11,72)
                                                  //| , (64,73), (11,74), (50,75), (7,76), (29,77), (5,78), (56,79), (40,80), (92
                                                  //| ,81), (2,82), (42,83), (43,84), (94,85), (2,86), (14,87), (7,88), (36,89), 
                                                  //| (26,90), (66,91), (4,92), (69,93), (15,94), (26,95), (47,96), (6,97), (90,9
                                                  //| 8), (29,99))
	withIndex.last._1                         //> res10: Int = 29

	productArray.diff(productArray2).distinct.sorted.mkString("The result is: [", " - ", "]")
                                                  //> res11: String = The result is: [0 - 2 - 4 - 5 - 6 - 11 - 19 - 26 - 29 - 32 
                                                  //| - 33 - 36 - 37 - 38 - 42 - 44 - 50 - 53 - 54 - 56 - 58 - 63 - 65 - 66 - 69 
                                                  //| - 76 - 79 - 80 - 81 - 83 - 90 - 92 - 94]

	val ar = collection.mutable.ArrayBuffer(1, 2, 3, 4, 5, 6)
                                                  //> ar  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5
                                                  //| , 6)
                                                  
 	for(a<-ar) println(a)                     //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
}