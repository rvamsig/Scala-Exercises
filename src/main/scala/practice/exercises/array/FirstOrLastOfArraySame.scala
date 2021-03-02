package practice.exercises.array

/*
* program to check if a given number is present in fast or last position of a given array of length 1 or more.
* */
object FirstOrLastOfArraySame {
  def searchSameValInArray(arr: Array[Int]): Boolean = {
    val arrLength = arr.length
    if (arrLength < 1) false
    else if (arrLength == 1) true
    else arr.head == arr.last
  }

  def main(args: Array[String]): Unit = {
    println(s"Search result in the Array: ${searchSameValInArray(Array(4, 2, 3, 4))}")
    println(s"Search result in the Array: ${searchSameValInArray(Array(1, 2, 3, 4))}")
    println(s"Search result in the Array: ${searchSameValInArray(Array(1))}")
    println(s"Search result in the Array: ${searchSameValInArray(Array())}")
  }
}
