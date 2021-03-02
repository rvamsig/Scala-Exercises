package practice.exercises.basics

object CheckNumbersInRange {
  def checkNumbersInRange(num1: Int, num2: Int): Int = {
    if ((num1 >= 20 && num1 <= 30) || (num2 >= 20 && num2 <= 30))
      List(num1, num2).max
    else 0
  }

  def main(args: Array[String]): Unit = {
    println(s"Return of the numbers in range : ${checkNumbersInRange(20, 26)}")
    println(s"Return of the numbers in range : ${checkNumbersInRange(2, 31)}")
    println(s"Return of the numbers in range : ${checkNumbersInRange(56, 19)}")

    println("Result: " + checkNumbersInRange(78, 95));
    println("Result: " + checkNumbersInRange(20, 30));
    println("Result: " + checkNumbersInRange(21, 25));
    println("Result: " + checkNumbersInRange(28, 28));

  }
}
