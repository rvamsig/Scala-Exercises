package practice.exercises.array

object ArrayAverage {
  def averageOfArray(arr: Array[Double]): Double = {
    val arrLen = arr.length
    val sumOfInt = arr.sum
    sumOfInt / arrLen
  }

  def forLoopAvg(arr: Array[Double]): Double = {
    var total = 0.0
    val arrayLen = arr.length
    for (i <- 0 to arr.length - 1) {
      total += arr(i)
    }
    total / arrayLen
  }

  def main(args: Array[String]): Unit = {
    println(s"Average of values of Array is : ${averageOfArray(Array(1, 2, 3, 4))}")
    println(s"Average of values of Array is : ${averageOfArray(Array(1, 2, 3, 4, 5, 6))}")
    println(s"Average of values of Array using forLoopAvg is : ${forLoopAvg(Array(1, 2, 3, 4, 5, 6))}")
  }
}
