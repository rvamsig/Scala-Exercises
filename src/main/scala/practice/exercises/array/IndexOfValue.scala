package practice.exercises.array

/*
*  program to find the index of an element in a given Array.
* */
object IndexOfValue {
  def indexOfGivenValue(arr: Array[Int], num: Int): Int = {
    arr.indexOf(num)
  }

  def main(args: Array[String]): Unit = {
    println(s"Index of the given integer: ${indexOfGivenValue(Array(1, 2, 3, 5, 8), 5)}")
    println(s"Index of the given integer: ${indexOfGivenValue(Array(1, 2, 3, 5, 8), 4)}")
  }
}
