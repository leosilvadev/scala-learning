package infractions


object InfractionManager extends App {
  
  val detection = Detection("ABCD1234", 150.20)
  val config = ManagerConfig("ZED", 100)
  val infraction = new Infraction with VelocityInfraction with PlateInfraction
  infraction.check(detection, config)
  println(detection.infractions.size)
}