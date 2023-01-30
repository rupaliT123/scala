package com.techsophy
package training.practice.basic

object AbsoluteDifference {
  def absolute_diff(x: Int, y: Int):Int={
    val abs_diff = Math.abs(x-y);
    if(x < y) abs_diff else abs_diff*3
  }
  def main(args:Array[String]):Unit={
    println(absolute_diff(60,51));
    println(absolute_diff(40,51));
  }

}
