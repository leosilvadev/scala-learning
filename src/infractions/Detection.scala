package infractions

import collection._

case class Detection(val plate:String, val velocity:Double, val infractions: mutable.Set[TransitInfraction] = mutable.Set()){

}