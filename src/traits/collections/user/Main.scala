package traits.collections.user

object Main {

  def main(args: Array[String]){
    def users = new Users
    users.add(new User("Leonardo", "Silva1", "leosilvadev1"))
    users.add(new User("Jhon", "Silva2", "jhonsilva2"))
    users.add(new User("Abil", "Silva3", "abilsilva3"))
    println(users.sort())
  }
  
}