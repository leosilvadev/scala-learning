package traits.collections.user

import scala.collection.mutable.MutableList


class Users extends Sortable[User] {
  
  private val users = new MutableList[User]
  
  def add(user: User) : Unit = {
    println("Before add: "+users.size)
    println("Adding: "+user)
    users.+=(user)
    println("Added: "+users.size)
  }
  
  override def iterator: Iterator[User] = users.iterator
  override def sort : List[User] = users.toList.sorted
  
}