package practice.exercises.array

/*
*  program to sum values of an given array
* */
object ArraySum {
  def reduceArray(arr: Array[Int]): Int = {
    arr.reduceLeft(_ + _)
  }

  def forLoopInt(arr: Array[Int]): Int = {
    var total = 0
    for (i <- 0 to arr.length - 1) {
      total += arr(i)
    }
    total
  }

  def forLoopDouble(arr: Array[Double]): Double = {
    var total = 0.0
    for (i <- 0 to arr.length - 1) {
      total += arr(i)
    }
    total
  }

  def sumOfArray(arr: Array[Int]): Int = {
    arr.sum
  }

  def main(args: Array[String]): Unit = {
    println(s"Sum of values in the array: ${sumOfArray(Array(1, 2, 3, 4))} ")
    println(s"Sum of values in the array: ${forLoopInt(Array(1, 2, 3, 4))} ")
    println(s"Sum of values in the array: ${forLoopDouble(Array(1.2, 2.2, 3.3, 4))} ")
    println(s"Sum of values in the array: ${reduceArray(Array(1, 2, 3, 4))} ")
  }
}
