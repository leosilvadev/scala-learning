package textprocessing

import scala.util.parsing.combinator._

// expr := term { "+" term | "-" term }
// term := factor { "*" factor | "/" factor }
// factor := number | identifier | "(" expr ")"

object ExpressionParser extends JavaTokenParsers {
  def expr: Parser[Any] = term ~ rep("+" ~ term | "-" ~ term)
  def term: Parser[Any] = factor ~ rep("*" ~ factor | "/" ~ factor)
  def factor: Parser[Any] = floatingPointNumber | ident | "(" ~ expr ~ ")"

  def main(args: Array[String]): Unit = {
    val parse = parseAll(expr, "3+4*x")
    println(parse)
    traverse(parse.get)
  }

  def traverse(a: Any): Unit = a match {
    case lst: List[Any] =>
      println("List")
      lst.foreach(traverse)
    case opt: Option[Any] =>
      println("Option")
      opt.foreach(traverse)
    case a ~ b =>
      traverse(a)
      print(" ~ ")
      traverse(b)
    case s: String =>
      println(s)
  }
}