package com.techsophy
package training.practice

//Write program for fibonacci series
object fibonacci {
   def main(args:Array[String]):Unit={
     var num :Int = scala.io.StdIn.readInt()
     var first_number:Int = 0
     var second_number :Int = 1
     var number:Int = 0
     for(i <- 1 to num-1)
       {
         print(first_number+" ")
         number = first_number+second_number
         first_number = second_number
         second_number = number
       }
       print(first_number)

     println("\nUsing Recursion----")

     val f :Int = 0
     val s :Int = 1
     var number1 :Int = num
     fibbonacci(f,s,number1)
     println("\nDone")
     println("Using Tail Recursion -----")
   }

  def fibbonacci(first: Int, second: Int,number1:Int) :Int = {
    if(number1 == 0)
      {
        return 0
      }
    print( first+" ")

    var num : Int = first + second
    var num1 = number1 - 1;
    fibbonacci(second, num,num1)
  }

}
