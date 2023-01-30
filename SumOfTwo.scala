package com.techsophy
package training.practice.basic

object SumOfTwo {
  def test1(x:Int,y:Int):Int={
    if(x == y) ((x+y)*3) else (x+y)
  }
  def main(args:Array[String]):Unit = {
    println("Result :"+test1(2,5))
    println("Result :"+test1(7,7))
  }

}
