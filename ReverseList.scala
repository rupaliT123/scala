package com.techsophy
package training.practice

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer

object ReverseList{

  def main(args:Array[String]):Unit ={
    val list = ListBuffer(8,3,9,1,7)
    val list1:ListBuffer[Int]=ListBuffer()
    val reversedList:List[Int] = reverseList(list,list1) .toList
    println(reversedList)
  }
  @tailrec
  def reverseList(list1:ListBuffer[Int],list:ListBuffer[Int]):ListBuffer[Int] = {
    if(list1.size == 0) list
    else {
      list.append(list1(list1.size-1))
      list1.remove(list1.size -1)
      reverseList(list1, list)
    }
  }
}
