package com.techsophy
package training.practice

import scala.::
import scala.annotation.tailrec

object SelectionSort {

  def main(args:Array[String]):Unit = {
    val list:List[Int] = List(-5,-4,100,-100,111,-4,0)
    println(selectionSort(list,Nil))
  }

  case class minIndexAndElement(element: Int, index: Int)
  @tailrec
  def minimumElement(list:List[Int],min:Int,index:Int,minIndex:Int,arraySize:Int):(Int,Int) = {
    if(arraySize==0){
      (min,minIndex)
    }else{
      if(list.head < min)
        minimumElement(list.tail,list.head,index+1,index+1,arraySize-1)
      else
        minimumElement(list.tail,min,index+1,minIndex,arraySize-1)
    }
  }

  @tailrec
  def selectionSort(oldList:List[Int],newList:List[Int]):List[Int] = {
    if(oldList .isEmpty)
      {
        newList
      }
    else
      {
        val min = oldList.head
        val temp = minimumElement(oldList.tail,min,-1,-1,oldList.size-1)
        if(temp._1 == min)
          {
            selectionSort(oldList.tail,newList:::List(temp._1))
          }
          else {
          val list = oldList.tail
          selectionSort(list.updated(temp._2, min), newList ::: List(temp._1))
        }

      }

  }

}
