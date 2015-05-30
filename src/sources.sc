object sources {

	case class TempData(day:Int, year:Int, precip:Double, aveTemp:Int, maxTemp:Int, minTempo:Int)

	def parseLine(line:String):TempData = {
		val p = line.split(",").map(_.trim)
		TempData(p(1).toInt, p(4).toInt, p(5).toDouble, p(6).toInt, p(7).toInt, p(8).toInt)
	}                                         //> parseLine: (line: String)sources.TempData
	
	val source = io.Source.fromFile("dev/workspaces/scala/scala-learning/TX417945_1263.csv")
                                                  //> source  : scala.io.BufferedSource = non-empty iterator
	val lines = source.getLines.toArray       //> lines  : Array[String] = Array(Source: MJ Menne CN Williams Jr. RS Vose NOAA
                                                  //|  National Climatic Data Center Asheville NC, "Day  ,JD  ,Month  ,State_id  ,
                                                  //| Year  ,PRCP (in),TAVE (F),TMAX (F),TMIN (F) ", "1,244,9,'417945',1946,0.02,8
                                                  //| 1,92,70 ", "2,245,9,'417945',1946,0.01,82,90,74 ", "3,246,9,'417945',1946,0,
                                                  //| 83,91,74 ", "4,247,9,'417945',1946,0,80,90,69 ", "5,248,9,'417945',1946,0,80
                                                  //| ,90,70 ", "6,249,9,'417945',1946,0,81,91,70 ", "7,250,9,'417945',1946,0.03,8
                                                  //| 1,90,71 ", "8,251,9,'417945',1946,0.23,79,86,72 ", "9,252,9,'417945',1946,0,
                                                  //| 83,92,74 ", "10,253,9,'417945',1946,0,83,92,74 ", "11,254,9,'417945',1946,0,
                                                  //| 81,93,69 ", "12,255,9,'417945',1946,0,83,94,71 ", "13,256,9,'417945',1946,0,
                                                  //| 82,91,72 ", "14,257,9,'417945',1946,0.37,74,80,67 ", "15,258,9,'417945',1946
                                                  //| ,4.71,69,73,64 ", "16,259,9,'417945',1946,0,77,84,69 ", "17,260,9,'417945',1
                                                  //| 946,0.15,77,81,72 ", "18,261,9,'417945',1946,0,77,82,71 ", "19,262,9,'417945
                                                  //| ',1946,0,77,83,70 ", "20
                                                  //| Output exceeds cutoff limit.
	
	val datas = lines.slice(2, lines.length).map(parseLine).toArray
                                                  //> datas  : Array[sources.TempData] = Array(TempData(244,1946,0.02,81,92,70), T
                                                  //| empData(245,1946,0.01,82,90,74), TempData(246,1946,0.0,83,91,74), TempData(2
                                                  //| 47,1946,0.0,80,90,69), TempData(248,1946,0.0,80,90,70), TempData(249,1946,0.
                                                  //| 0,81,91,70), TempData(250,1946,0.03,81,90,71), TempData(251,1946,0.23,79,86,
                                                  //| 72), TempData(252,1946,0.0,83,92,74), TempData(253,1946,0.0,83,92,74), TempD
                                                  //| ata(254,1946,0.0,81,93,69), TempData(255,1946,0.0,83,94,71), TempData(256,19
                                                  //| 46,0.0,82,91,72), TempData(257,1946,0.37,74,80,67), TempData(258,1946,4.71,6
                                                  //| 9,73,64), TempData(259,1946,0.0,77,84,69), TempData(260,1946,0.15,77,81,72),
                                                  //|  TempData(261,1946,0.0,77,82,71), TempData(262,1946,0.0,77,83,70), TempData(
                                                  //| 263,1946,0.0,75,83,67), TempData(264,1946,0.0,79,89,69), TempData(265,1946,0
                                                  //| .0,84,94,74), TempData(266,1946,0.0,72,77,66), TempData(267,1946,0.0,75,80,6
                                                  //| 9), TempData(268,1946,3.27,77,85,69), TempData(269,1946,3.8,77,85,69), TempD
                                                  //| ata(270,1946,3.13,78,86,
                                                  //| Output exceeds cutoff limit.
  datas.map(_.maxTemp).max                        //> res0: Int = 111
     
	source.close
}