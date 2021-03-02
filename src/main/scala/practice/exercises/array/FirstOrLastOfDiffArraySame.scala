package practice.exercises.array

/*
* program to check whether the value of the first or last element of two given array ( length 1 or more) of integers are same or not.
* */
object FirstOrLastOfDiffArraySame {
  def searchSameValInArray(arr1: Array[Int], arr2: Array[Int]): Boolean = {
    val arr1Length = arr1.length
    val arr2Length = arr2.length
    if (arr1Length < 1 || arr2Length < 1) false
    else if (arr1Length == 1 && arr2Length == 1) arr1.head == arr2.head
    else
      println(s"${arr1.head} ${arr2.last}   ${arr1.last}  ${arr2.head}")
    (arr1.head == arr2.last || arr1.last == arr2.head)
  }

  def main(args: Array[String]): Unit = {
    println(s"Search result in the Array: ${searchSameValInArray(Array(4, 2, 3, 4), Array(4, 2, 3, 4))}")
    println(s"Search result in the Array: ${searchSameValInArray(Array(1, 2, 3, 4), Array(1, 2, 3, 4))}")
    println(s"Search result in the Array: ${searchSameValInArray(Array(1), Array(1))}")
    println(s"Search result in the Array: ${searchSameValInArray(Array(1), Array(2))}")

  }
}
