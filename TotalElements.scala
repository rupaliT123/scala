package com.techsophy
package training.practice

import scala.annotation.tailrec

object TotalElements {

  def main(args:Array[String]):Unit = {
    val list :List[Int] = List(5,5,2,9,2,8);
    var count:Int = 0
    var duplicateList:List[Int] = list
    println(findListLength(duplicateList,count))
  }
  @tailrec
  def findListLength(duplicateList:List[Int],count:Int):Int = {
    if(duplicateList.isEmpty) count
    else {
      findListLength(duplicateList.tail,count+1)
    }
  }

}
