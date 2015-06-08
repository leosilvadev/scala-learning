package traits.collections.user

object Main {

  def main(args: Array[String]){
    val users = Users()
    users.add(User("Leonardo", "leosilvadev", "leo123", 26))
    users.add(User("John", "johndev", "john123", 28))
    users.add(User("Clue", "cluedev", "clue123", 25))
    println(users.sort)
  }
  
}