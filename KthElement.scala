package com.techsophy
package training.practice

import training.Collections.list

object KthElement{

  def main(args:Array[String]):Unit ={
    var list: List[Int] = List(7,4,3,1,8)
    var k: Int = scala.io.StdIn.readInt()
    if(k > list.size)
      {
        println("Invalid k ")
      }
    else
      {
        println("kth element is : "+kWithRecursion(list,k-1))
      }
    //  def rec(k:Int,list:List[Int]):Unit = (k,list) match {
    //    case 0 => println(list.head)
    //    case i if i 0 =>
    //  }

  }
  def kWithRecursion(list:List[Int],k:Int):Int ={
    if(k == 0) return (list.head)
    var list1 = list.tail
    kWithRecursion(list1,k-1)
  }

}
