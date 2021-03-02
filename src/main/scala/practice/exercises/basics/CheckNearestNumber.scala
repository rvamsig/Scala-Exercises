package practice.exercises.basics

object CheckNearestNumber {
  def checkNearestNumber(num1: Int, num2: Int): Int = {
    val num1Abs = (100 - num1).abs
    val num2Abs = (100 - num2).abs
    if (num1Abs > num2Abs) num2
    else if (num1 == num2) 0
    else num1
  }

  def main(args: Array[String]): Unit = {
    println(s"Check the nearest number to 100: ${checkNearestNumber(65, 94)}")
    println(s"Check the nearest number to 100: ${checkNearestNumber(45, 34)}")
    println(s"Check the nearest number to 100: ${checkNearestNumber(34, 34)}")
    println(s"Check the nearest number to 100: ${checkNearestNumber(97, 34)}")
  }
}
