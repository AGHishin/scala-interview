package com.particeep.test

object WhatsWrong1 {

  trait Interface {
    val city: String
   
   //val support: String = s"Ici c'est $city !"
   //solution to fix
   lazy val support: String = s"Ici c'est $city !"
  }

  case object Supporter extends Interface {

    override val city = "Paris"
  }

  Supporter.city //What does this print ? res0: String = Paris
  Supporter.support //What does this print and why ? How to fix it ?
  
   //res1: String = Ici c'est null !
   
   
}
