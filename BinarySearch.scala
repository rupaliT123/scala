package com.techsophy
package training.practice

import scala.annotation.tailrec

object BinarySearch {
  def main(args:Array[String]):Unit = {
    val list:List[Int] = List(1,2,3,4,5)
    val searchNum:Int =  4
    println(binarySearch(list,0,list.size-1,searchNum,false))
  }
  @tailrec
  def binarySearch(list:List[Int],left:Int,right:Int,target:Int,isThere:Boolean):Boolean={
    if(left > right)
      {
         return isThere
      }
      val mid = (left+right)/2
    if(list(mid) == target)
      {
        true
      }
    else if(list(mid) < target)
      {
        binarySearch(list,mid+1,right,target,isThere)
      }
    else
      {
        binarySearch(list,left,mid-1,target,isThere)
      }
  }

}
