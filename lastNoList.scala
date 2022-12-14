package com.techsophy
package training.practice

import scala.collection.convert.ImplicitConversions.{`collection asJava`, `mutableSeq AsJavaList`}
import scala.collection.mutable.ListBuffer

object lastNoList extends App{
  // list last number with listBuffer
  var x: Int = scala.io.StdIn.readInt()
  var listBuffer = new ListBuffer[Int]()
  while (x != 0)
  {
    listBuffer.append(scala.io.StdIn.readInt())
    x = x - 1
  }
  val list: List[Int] =  listBuffer.toList;
  getLastNumber(listBuffer)
  println("Last Number is :"+listBuffer.get(0))

  def getLastNumber(listBuffer: ListBuffer[Int]):ListBuffer[Int]={
    if(listBuffer.size == 1)
      {
        return listBuffer.tail
      }
        listBuffer.remove(0)
        getLastNumber(listBuffer)
  }

  // list last number
  val list2 :List[Int] = List(1,2,3,4)
  println("list2 last number :"+list2.last)
}
