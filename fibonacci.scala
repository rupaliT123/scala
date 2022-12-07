package com.techsophy
package training.practice

//Write program for fibonacci series
object fibonacci {
   def main(args:Array[String]):Unit={
     val num :Int = scala.io.StdIn.readInt()
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
   }

}
