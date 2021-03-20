package practice.exercises.array

/*
*  program to rotate one element left of an given array (length 1 or more) of integers.
* */

object RotateAnElement {
 /* def rotateAnArrayElement(arr: Array[String]): String={
    ""
  }*/

  def rotate_left(arr: Array[Int]): Array[Int] = {
    if (arr.length < 1) false
    arr.tail :+ arr.head
  }
  def main(args: Array[String]): Unit =
  {
    val nums1 = Array(1,2,3,4,5,6,7)
    println("Original Array elements:")
    // Print all the array elements
    for ( x <- nums1 ) {
      print(s"${x}, ")
    }
    println("\nRotate left one element:")
    var result_left1 = rotate_left(nums1)
    for ( x <- result_left1 ) {
      print(s"${x}, ")
    }
    val nums2 = Array(1,2)
    println("\nOriginal Array elements:")
    // Print all the array elements
    for ( x <- nums2 ) {
      print(s"${x}, ")
    }
    println("\nRotate left one element:")
    var result_left2 = rotate_left(nums2)
    for ( x <- result_left2 ) {
      print(s"${x}, ")
    }
    val nums3 = Array(100)
    println("\nOriginal Array elements:")
    // Print all the array elements
    for ( x <- nums3 ) {
      print(s"${x}, ")
    }
    println("\nRotate left one element:")
    var result_left3 = rotate_left(nums3)
    for ( x <- result_left3 ) {
      print(s"${x}, ")
    }
  }
}
