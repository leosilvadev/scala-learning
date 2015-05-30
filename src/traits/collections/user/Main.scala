package traits.collections.user

object Main {

  def main(args: Array[String]){
    val users = new Users
    users.add(User("1", "1", "1"))
    users.add(User("2", "2", "2"))
    users.add(User("3", "3", "3"))
    println(users.users)
  }
  
}