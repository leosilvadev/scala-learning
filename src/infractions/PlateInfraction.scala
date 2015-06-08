package infractions

trait VelocityInfraction extends Infraction {

  private val price = 120.50
  
  override def check(detection: Detection, config: ManagerConfig): Unit = {
    println("VelocityInfraction")
    import infractions.IFCondition
    val notPermitted = (config.permittedVelocity < detection.velocity)
    if(notPermitted) detection.infractions += TransitInfraction(detection, price)
  }

}