package textprocessing

import scala.util.parsing.combinator._

class ExpressionParserToTree(str: String) extends (Map[String, Double] => Double) {
  import ExpressionParserToTree._
  private val root = parseAll(expr, str).get

  def apply(vars: Map[String, Double]): Double = root(vars)
}

object ExpressionParserToTree extends JavaTokenParsers {
  def expr: Parser[Expr] = term ~ rep("+" ~ term | "-" ~ term) ^^ { case t ~ lst => OpSeq(t, lst) }

  def term: Parser[Expr] = factor ~ rep("*" ~ factor | "/" ~ factor) ^^ { case f ~ lst => OpSeq(f, lst) }

  def factor: Parser[Expr] = floatingPointNumber ^^ (s => Number(s.toDouble)) |
    ident ^^ (s => Ident(s)) |
    "(" ~ expr ~ ")" ^^ { case _ ~ e ~ _ => e }

  def main(args: Array[String]): Unit = {
    val e1 = new ExpressionParserToTree("3+4*x")
    println(e1(Map("x" -> 6)))
    println(e1(Map("x" -> 5)))
    val e2 = new ExpressionParserToTree("3+4-x")
    println(e2(Map("x" -> 6)))
  }

  sealed trait Expr extends (Map[String, Double] => Double) {
    def apply(vars: Map[String, Double]): Double
  }

  case class Number(x: Double) extends Expr {
    def apply(vars: Map[String, Double]): Double = x
  }

  case class Ident(name: String) extends Expr {
    def apply(vars: Map[String, Double]): Double = vars(name)
  }

  case class OpSeq(first: Expr, rest: List[String ~ Expr]) extends Expr {
    def apply(vars: Map[String, Double]): Double = recur(first(vars), rest, vars)

    def recur(x: Double, more: List[String ~ Expr], vars: Map[String, Double]): Double = more match {
      case Nil => x
      case (hop ~ hexpr) :: t =>
        hop match {
          case "+" => recur(x + hexpr(vars), t, vars)
          case "-" => recur(x - hexpr(vars), t, vars)
          case "*" => recur(x * hexpr(vars), t, vars)
          case "/" => recur(x / hexpr(vars), t, vars)
        }
    }
  }
}