package mud.mutable

case class BankAccount(private var myAmount: Int) {

  def deposit(money: Int):Unit = {
     myAmount += money
  }
  
  def amount = myAmount
  
}

object BankApp extends App {
  
  var bank = BankAccount(0)
  bank.deposit(10)
  bank.deposit(50)
  println(bank.amount)
  
}