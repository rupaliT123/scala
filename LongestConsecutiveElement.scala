package com.techsophy
package training.practice

import scala.annotation.tailrec

object LongestConsecutiveElement {
  def main(args:Array[String]):Unit = {
    val list:List[Int] =  List(1,2,3,3,4,4,4)
    if(list.isEmpty) println("Given list is empty")
    else println(longestConsecutive(list.head,list.head,1,1,list.tail))
  }
  @tailrec
  def longestConsecutive(finalElement: Int, element: Int, frequency: Int, finalFrequency: Int, list: List[Int]):(Int,Int)={
    if(list.isEmpty)
      {
        return (finalElement,finalFrequency)
      }
    if(element == list.head)
      {
         if(frequency+1 > finalFrequency)
           {
             longestConsecutive(list.head,element,frequency+1,frequency+1,list.tail)
           }
           else {
           longestConsecutive(finalElement,list.head,frequency+1,finalFrequency,list.tail)
         }
      }
      else {
      longestConsecutive(finalElement, list.head,1,finalFrequency,list.tail)
    }
  }

}
