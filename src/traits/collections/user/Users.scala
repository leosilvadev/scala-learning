package traits.collections.user

import scala.collection.mutable.Buffer


case class Users(val users: Buffer[User] = Buffer[User]()) extends Sortable[User] {
  
  def add(user: User) : Unit = {
    println("Before add: "+users.size)
    println("Adding: "+user)
    users += user
    println("Added: "+users.size)
  }
  
  override def iterator: Iterator[User] = users.iterator
  override def sort : List[User] = users.toList.sorted
  
}