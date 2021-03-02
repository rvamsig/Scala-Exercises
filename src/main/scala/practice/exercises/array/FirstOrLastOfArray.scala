package practice.exercises.array

/*
* program to check if a given number is present in fast or last position of a given array of length 1 or more.
* */
object FirstOrLastOfArray {
  def searchInArray(arr: Array[Int], num: Int): String = {
    val firstVal = arr(0)
    val arrLength = arr.length
    val lastVal = arr(arrLength - 1)
    if (firstVal == num) "First"
    else if (lastVal == num) "Last"
    else "Number Not found either at First or Last position."
  }

  def main(args: Array[String]): Unit = {
    println(s"Search result in the Array: ${searchInArray(Array(1, 2, 3, 4), 4)}")
  }
}
