package practice.exercises.basics

/*
*  program to check whether a given positive number is a
*  multiple of 3 or a multiple of 7.
* */
object CheckNumberMultiplier {
  def checkMultiplier(x: Int): Boolean = {
    x % 3 == 0 || x % 7 == 0
  }

  def main(args: Array[String]): Unit = {
    println(s"result: ${checkMultiplier(50)}")
    println(s"result: ${checkMultiplier(28)}")
    println(s"result: ${checkMultiplier(14)}")
    println(s"result: ${checkMultiplier(45)}")
  }
}
