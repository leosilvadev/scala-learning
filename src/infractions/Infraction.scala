package infractions

trait Infraction {
  
  def check(detection: Detection, config: ManagerConfig): Unit = {}
  
}