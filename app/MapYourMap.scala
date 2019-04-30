package com.particeep.test

/**
  * Tell developer names by the department code
  * Expected result:
  * Map(frontend -> List(Remy, Alexandre), analytics -> List(Pierre), api -> List(Noe))
  */
object MapYourMap {

  val devNames = Map("dev1" -> "Pierre", "dev2" -> "Remy", "dev3" -> "Noe", "dev4" -> "Alexandre")
  val devDepartments = Map("dev1" -> "analytics", "dev2" -> "frontend", "dev3" -> "api", "dev4" -> "frontend")

  val namesInDepartments:Map[String, List[String]] = functionNameInDepartements (devNames,devDepartments)
 /** function names by the department **/
  
  def functionNameInDepartements (map1:Map[String, String],map2:Map[String, String]):Map[String, List[String]]={
   var MapResult:Map[String, List[String]] = Map()
    map2.foreach{
      var liste:List[String]=List()
		  keyVal => map1.foreach {
		   
		   keyValN=>  if(keyVal._1==keyValN._1){
		     liste=keyValN._2::liste
		     MapResult=MapResult+(keyVal._2->liste)
		   }
		    
		    
		  }
    
    
    
  }
    return MapResult;
    
  }
}
