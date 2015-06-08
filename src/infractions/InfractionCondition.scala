package infractions

case class IFCondition(condition:Boolean) {

  implicit def convert(condition:Boolean) = IFCondition(condition)
  
  def then(func: => (Infraction, Boolean)) = {
    if(condition)
      func
    else 
      IFCondition(condition)
  }
  
}

case class ElseCondition(condition:Boolean) {

  implicit def convert(condition:Boolean) = ElseCondition(condition)
  
  def orElse(func: => (Infraction, Boolean)) = {
    func
  }
  
}