package practice.exercises.array

import scala.collection.mutable.ArrayBuffer

/*
* program to remove a specific element from an given array.
* Note: The size of an Array can't be changed, so we can't directly delete elements
*  from an array but replace them with "" / null etc.
* */
object RemoveCertainVal {
  def replaceCertainValue(arr: Array[String]): ArrayBuffer[String] = {
    arr(0) = ""
    var arrbuffer= ArrayBuffer[String]()
    for (i <-0 to arr.length-1) {
      arrbuffer +=  arr(i)
    }
    arrbuffer
  }


  def main(args: Array[String]): Unit = {
    println(s"Result: ${replaceCertainValue(Array("Red", "Blue", "Black", "Green", "White"))}")

    val days = Array("Red", "Blue", "Black", "Green", "White")
    println("Array elements are : ")
    for ( m1 <-days )
    {
      println(m1 )
    }
  }
}
