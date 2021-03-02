package practice.exercises.basics

object CheckLargestNumber {
  def checkLargestNumber(num1: Int, num2: Int, num3: Int): Int = {
    List(num1, num2, num3).max
  }

  def main(args: Array[String]): Unit = {
    println(s"Largest amongst the given numbers is : ${checkLargestNumber(5, 6, 7)}")
    println(s"Largest amongst the given numbers is : ${checkLargestNumber(53, 56, 97)}")
  }
}
