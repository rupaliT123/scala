package com.techsophy
package training.practice

import scala.annotation.tailrec

object EvenOddUsingTailRecursion
{
  def main(args:Array[String]):Unit = {
    val list:List[Int] = List(1,2,3,4,7,8,9)

    println(evenOrOdd(Nil,Nil,list))
  }

  @tailrec
  def evenOrOdd(evenList:List[Int],oddList:List[Int],list:List[Int]):(List[Int],List[Int]) = {
    if(list.isEmpty)
      {
        (evenList,oddList)
      }
     else if(list.head % 2 == 0)
      {
        evenOrOdd(list.head::evenList,oddList,list.tail)
      }
      else
      {
        evenOrOdd(evenList,list.head::oddList,list.tail)
      }
  }

}
