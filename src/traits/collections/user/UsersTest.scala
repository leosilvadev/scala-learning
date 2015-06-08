package traits.collections.user

import org.scalatest.FlatSpec

/**
 * @author leonardo
 */
class UsersTest extends FlatSpec {
  
  behavior of "Users class"
  
  it should "add new users" in {
    val users = Users()
    users.add(User("Leonardo", "leosilvadev", "leo123", 26))
    users.add(User("John", "johndev", "john123", 28))
    users.add(User("Clue", "cluedev", "clue123", 25))
    
    assertResult(3)(users.users.size)
  }
  
  it should "sort the users" in {
    val users = Users()
    users.add(User("Leonardo", "leosilvadev", "leo123", 26))
    users.add(User("John", "johndev", "john123", 28))
    users.add(User("Clue", "cluedev", "clue123", 25))
    
    val sortedUsers = users.sort()
    assertResult(3)(sortedUsers.size)
    assertResult("Clue")(sortedUsers(0).name)
    assertResult("John")(sortedUsers(1).name)
    assertResult("Leonardo")(sortedUsers(2).name)
  }
  
}