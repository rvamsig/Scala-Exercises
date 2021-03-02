package practice.exercises.basics

object Numbers2WithInRange {
  def check2NumWithInRange(num1: Int, num2: Int): Boolean = {
    ((num1 >= 20 || num2 <= 50) || (num2 >= 20 || num1 <= 50))

  }

  def main(args: Array[String]): Unit = {
    println(s"Check if the numbers are in beteeen 20 and 50: ${check2NumWithInRange(20, 15)}")
    println(s"Check if the numbers are in beteeen 20 and 50: ${check2NumWithInRange(20, 45)}")
    println(s"Check if the numbers are in beteeen 20 and 50: ${check2NumWithInRange(20, 25)}")
    println(s"Check if the numbers are in beteeen 20 and 50: ${check2NumWithInRange(200, 55)}")
    println("Check if the numbers are in beteeen 20 and 50: " + check2NumWithInRange(11, 20));
    println("Check if the numbers are in beteeen 20 and 50: " + check2NumWithInRange(30, 30));
    println("Check if the numbers are in beteeen 20 and 50: " + check2NumWithInRange(25, 35));
    println("Check if the numbers are in beteeen 20 and 50: " + check2NumWithInRange(15, 12));
  }

}
