package com.techsophy
package training.practice.basic

object IsNumThirty{
  def isItThirty(x: Int, y: Int):Boolean={
//    if(x == 30 || y == 30 || x+y == 30) true else false
    // One more way
    x == 30 || y == 30 || x+y == 30
  }
  def main(args:Array[String]):Unit={
    println("Result: " + isItThirty(30, 0))
    println("Result: " + isItThirty(25, 5))
    println("Result: " + isItThirty(30, 20))
    println("Result: " + isItThirty(25, 20))
  }
}
