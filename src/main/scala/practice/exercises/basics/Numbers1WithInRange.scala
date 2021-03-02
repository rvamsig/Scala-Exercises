package practice.exercises.basics

/*
* program to check two given integers whether either of them is in the range 100..200 inclusive.
* */
object Numbers1WithInRange {

  def checkNumberWithInRange(num1: Int, num2: Int): Boolean = {
    (100 >= num1 && num1 <= 200) || (100 >= num2 && num2 <= 200)
  }

  def main(args: Array[String]): Unit = {
    println(s"Check whether the numbers are in Range or not: ${checkNumberWithInRange(10, 195)}")
    println(s"Check whether the numbers are in Range or not: ${checkNumberWithInRange(162, 200)}")
    println(s"Check whether the numbers are in Range or not: ${checkNumberWithInRange(100, 200)}")
  }

}
