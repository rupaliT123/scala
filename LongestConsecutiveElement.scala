package com.techsophy
package training.practice

import com.techsophy.training.practice.LongestConsecutiveElement.LongestSequenceInfo

import scala.annotation.tailrec

object LongestConsecutiveElement {
  def main(args:Array[String]):Unit = {
    val list:List[Int] =  List(-1,-1,-1,0,0,0,1,2,3,3,3,4,4,4,5,5)
    if(list.isEmpty) println("Given list is empty")
    else {
      val c = longestConsecutive(list.head, list.head, 1, 1, list.tail)
      println("Element: "+c.element)
      println("Frequency: "+c.frequency)
    }
  }
  case class LongestSequenceInfo(element: Int, frequency: Int)

  @tailrec
  def longestConsecutive(finalElement: Int, element: Int, frequency: Int, finalFrequency: Int, list: List[Int]):LongestSequenceInfo={
    if(list.isEmpty)
      {
        return LongestSequenceInfo(finalElement,finalFrequency)
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
