package mud.immutable

case class BankAccount(private val myAmount: Int) {

  def deposit(money: Int) = {
    BankAccount(myAmount + money)
  }
  
  def amount = myAmount
  
}

object BankApp extends App {
  val bankAccount = BankAccount(0).deposit(10).deposit(50).deposit(10)
  println(bankAccount.amount)
}