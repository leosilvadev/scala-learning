import scala.annotation.tailrec

object recursions {
  
  def factorial(number: Long): Long = if(number<2) 1 else number * factorial(number - 1)
                                                  //> factorial: (number: Long)Long
  
  factorial(50)                                   //> res0: Long = -3258495067890909184
 
 
 
 	def estimatePi(number: Int): Double = {
 		@tailrec
 		def helper(number: Int, sum: Int): Double = {
 			if(number<1) sum else {
 				val x = math.random
 				val y = math.random
 				helper(number-1, sum+(if(x*x+y*y<1) 1 else 0))
 			}
 		}
 		helper(number,0)/number*4
 	}                                         //> estimatePi: (number: Int)Double
  
  estimatePi(1000000)                             //> res1: Double = 3.1439
  
}