package traits.collections.user

object Main {

  def main(args: Array[String]){
    val users = new Users
    users.add(User("Leonardo", "leosilvadev", "leo123"))
    users.add(User("John", "johndev", "john123"))
    users.add(User("Clue", "cluedev", "clue123"))
    println(users.sort)
  }
  
}