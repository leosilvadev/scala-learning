package parallelism

/**
 * @author leonardo
 */
object ParFibApp extends App {
  
  def fib(number:Int):Int = if(number<2) 1 else fib(number-1) + fib(number-2)
 
  for(i <- (30 to 15 by -1).par) println(fib(i))
  
  println()
  
  var i = 0
  for(j <- (1 to 1000000).par) i+=1
  println(i)
  
}