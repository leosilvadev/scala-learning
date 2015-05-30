package traits.collections.user

class User(val name: String, val username: String, val password: String) extends Comparable[User] {

  override def compareTo(other: User) : Int = this.name.compareTo(other.name)
  
  override def toString() = s"${this.name}, ${this.username}, secret: ${this.password}"
  
}

object User {
  
  def apply(name: String, username: String, password: String) = new User(name, username, password)
  
}