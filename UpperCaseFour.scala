package com.techsophy
package training.practice.basic

import scala.annotation.tailrec

object UpperCaseFour {
  def main(args:Array[String]):Unit={
    println("Result: " + uppercaseStr("Scala",""))
    println("Result: " + uppercaseStr("Python",""))
    println("Result: " + uppercaseStr("abc",""))
  }
  @tailrec
  def uppercaseStr(str: String, str1: String):String={
    if(str.length<4)
      {
        return str.toUpperCase()
      }
    if(str.length == 4) str1 + str.toUpperCase() else uppercaseStr(str.tail,str1+str.head)
  }

}
