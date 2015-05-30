package traits.collections.user

class User(val name: String, val username: String, val password: String, val age: Int) extends Comparable[User] {

  override def compareTo(other: User) : Int = this.name.compareTo(other.name)
  
  override def toString() = s"${this.name}, ${this.username}, secret: ${this.password}"
  
}

object User {
  
  import util.Random._
  
  def apply(name: String, username: String, password: String, age: Int) = new User(name, username, password, age)
  
  def generate = new User(nextString(10), nextString(10), nextString(10), nextInt(80))
  
}