package com.particeep.test

/**
  * This is basic language questions so don't use external library or build in function
  */
object BasicScala {


  /**
    * Encode parameter in url format
    *
    * Example:
    *
    * input  : Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
    * output : "?sort_by=name&order_by=asc&user_id=12"
    *
    * input  : Map()
    * output : ""
    */
  def encodeParamsInUrl(params: Map[String, String]): String = {
    
    var str: String="?";
		params.foreach {
		  keyVal => str+=keyVal._1 + "=" + keyVal._2+"&"
		  }
			
		str=str.substring(0,str.length()-1)
		
		return str
	}


  /**
    * Test if a String is an email
    */
  def isEmail(maybeEmail: String): Boolean = {
  
  val mail = new Regex("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$")
  
     if (mail.findFirstIn(maybeEmail) == None){
       false 
       }else 
         true
  
  }


  /**
    * Compute i ^ n
    *
    * Example:
    *
    * input : (i = 2, n = 3) we compute 2^3 = 2x2x2
    * output : 8
    *
    * input : (i = 99, n = 38997)
    * output : 1723793299
    */
  def power(i:Int, n:Int):Int = {
     if(n==0){
       return 1
     }else{
      return i*power(i,n-1)}
     
  }


}
