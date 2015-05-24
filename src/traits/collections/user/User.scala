package traits.collections.user

class User(val name: String, val username: String, val password: String) extends Comparable[User] {

  override def compareTo(other: User) : Int = this.name.compareTo(other.name)
  
}