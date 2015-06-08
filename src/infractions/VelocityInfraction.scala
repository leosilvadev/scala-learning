package infractions

trait PlateInfraction extends Infraction {

  private val price = 100.50
  
  override def check(detection: Detection, config: ManagerConfig): Unit = {
    println("PlateInfraction")
    val permittedPlatesPattern = s"^${config.permittedPlates}".r
    val notPermitted = !(permittedPlatesPattern findFirstIn detection.plate).isDefined
    if(notPermitted) detection.infractions += TransitInfraction(detection, price)
  }
  
}