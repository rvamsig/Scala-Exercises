package practice.exercises.basics

object AddTwoNums {
  def sumOfTwo(x: Int, y: Int): Int = {
    if (x == y) (x + y) * 3 else x + y
  }

  def main(args: Array[String]): Unit = {
    println(s"Result of the numbers: ${sumOfTwo(1, 2)}")
    println(s"Result of the numbers: ${sumOfTwo(2, 2)}")
  }
}
