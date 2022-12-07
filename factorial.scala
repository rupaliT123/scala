package com.techsophy
package training.practice

//find factorial of a number using while loop , recursion and tail recursion

object factorial {

  def main(args: Array[String]): Unit = {
    var num = scala.io.StdIn.readInt();
    val num1: Int = num;

    var fact: Int = 1;
    while (num > 1) {
      fact = fact * num;
      num = num - 1
    }
    println(fact)
    //Using Recursion
    println(fact_of_number(num1))
    //Using tail recursion
    println(fact_using_tail_recursion(num1,1))

  }

  def fact_of_number(number: Int): Int = {
    if (number == 1) 1
    else
      number * fact_of_number(number - 1)
  }

  def fact_using_tail_recursion(num:BigInt, acc:BigInt):BigInt={
    if(num <= 0) acc
    else fact_using_tail_recursion(num-1,acc * num)
  }

}
