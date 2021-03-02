package practice.exercises.basics

/*
*  Program to check whether three given integer values are in the range 20..50 inclusive.
*  Return true if 1 or more of them are in the said range otherwise false.
* */
object Numbers3WithInRange {
  def checkNumberInRange(num1: Int, num2: Int, num3: Int): Boolean = {
    (num1 >= 20 && num1 <= 50) || (num2 >= 20 && num2 <= 50) || (num3 >= 20 && num3 <= 50)
  }

  def main(args: Array[String]): Unit = {
    println(s"Check if the numbers are in beteeen 20 and 50: ${checkNumberInRange(20, 15, 30)}")
    println(s"Check if the numbers are in beteeen 20 and 50: ${checkNumberInRange(20, 45, 30)}")
    println(s"Check if the numbers are in beteeen 20 and 50: ${checkNumberInRange(20, 25, 50)}")
    println(s"Check if the numbers are in beteeen 20 and 50: ${checkNumberInRange(200, 55, 100)}")
    println("Result: " + checkNumberInRange(11, 20, 12));
    println("Result: " + checkNumberInRange(30, 30, 17));
    println("Result: " + checkNumberInRange(25, 35, 50));
    println("Result: " + checkNumberInRange(15, 12, 8));
  }
}
