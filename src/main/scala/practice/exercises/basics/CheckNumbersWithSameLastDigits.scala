package practice.exercises.basics

object CheckNumbersWithSameLastDigits {
  def checkLastDigits(num1: Int, num2: Int): Boolean = {
    num1.toString.last == num2.toString.last
  }

  def checkLastDigitsMath(num1: Int, num2: Int): Boolean = {
    Math.abs(num1 % 10) == Math.abs(num2 % 10)
  }


  def main(args: Array[String]): Unit = {
    println(s"Check if the last digits match for given numbers: ${checkLastDigits(156, 56)}")
    println(s"Check if the last digits match for given numbers: ${checkLastDigits(15, 50)}")
    println(s"Check if the last digits match for given numbers: ${checkLastDigits(1, 51)}")
    println("------------------------------------------------")
    println(s"Check if the last digits match for given numbers: ${checkLastDigitsMath(156, 56)}")
    println(s"Check if the last digits match for given numbers: ${checkLastDigitsMath(15, 50)}")
    println(s"Check if the last digits match for given numbers: ${checkLastDigitsMath(1, 51)}")
    println("------------------------------------------------")
    println("Result: " + checkLastDigits(123, 456))
    println("Result: " + checkLastDigits(12, 512))
    println("Result: " + checkLastDigits(7, 87))
    println("Result: " + checkLastDigits(12, 45))
  }
}
