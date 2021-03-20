package practice.exercises.array

/*
* program to calculate the sum of the last 3 elements of an array of integers.
* If the array length is less than 3 then return the sum of the array. Return 0 if the array is empty.
* */
object SumOfLast3Elements {
  def sumOfLast3Elements(array: (Array[Int])): Int = {
    val arrLength = array.length
    if (array.isEmpty) 0
    else if (arrLength > 0 && arrLength < 3) array.sum
    else array.takeRight(3).sum
  }

  def main(args: Array[String]): Unit = {

    println(s"Sum of last 3 elements is: ${sumOfLast3Elements(Array(1, 2, 3, 4))}")
    println(s"Sum of last 3 elements is: ${sumOfLast3Elements(Array(1, 2, 3))}")
    println(s"Sum of last 3 elements is: ${sumOfLast3Elements(Array())}")
  }

}
