package traits.collections.user

trait Sortable[A <: Comparable[A]] extends Iterable[A] {

  def sort() : Iterable[A] = {
    this.toList.sorted
  }
  
}