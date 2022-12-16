package com.techsophy
package training.practice

import scala.annotation.tailrec

object Palindrome {
  def main(args:Array[String]):Unit = {
    val list1:List[Int] = List(1,2,3,2,1)
    val list2:List[Int] = List(1,2,3,4,1)
    var i:Int = 0
    var j:Int = list1.size-1
    var isPalindrome:Boolean = true

    // Using tail recursion for list1
    if (list1.size == 1) {
      isPalindrome = true
      println("Given list1 is palindrome :"+isPalindrome)
    }
    else {
      println("Given list1 is palindrome :"+palindromeCheck(list1,i,j,isPalindrome))
    }

    // Using pattern matching for list2
    var k: Int = list2.size - 1
    if (list2.size == 1) {
      isPalindrome = true
      println("Given list2 is palindrome :" + isPalindrome)
    }
    else {
      println("Given list2 is palindrome :" + palindromeCheck1(list2, i, k, isPalindrome))
    }

  }

  @tailrec
  def palindromeCheck(list: List[Int], i: Int, j: Int, isPalindrome: Boolean): Boolean = {
    if (i >= j) return isPalindrome
    else if (isPalindrome == false) return isPalindrome
    if (list(i) != list(j)) {
      palindromeCheck(list, i + 1, j - 1, false)
    }
    else {
      palindromeCheck(list, i + 1, j - 1, true)
    }
  }


  def palindromeCheck1(list: List[Int], i: Int, j: Int,isPalindrome:Boolean):Boolean = i match {

    case x if(i >= j) => isPalindrome
    case _ if (isPalindrome == false) => isPalindrome
    case _ if (list(i) != list(j)) => palindromeCheck(list, i+1, j-1, false)
    case _ if(list(i) == list(j)) =>palindromeCheck(list,i+1,j-1,true)
  }

}
