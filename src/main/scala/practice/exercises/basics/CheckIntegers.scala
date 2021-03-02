package practice.exercises.basics

object CheckIntegers {
  def checkIntergers(x: Int, y: Int): Boolean = {
    x == 30 || y == 30 || (x + y == 30)
  }

  def main(args: Array[String]): Unit = {
    println(s"Result of checkInteger: ${checkIntergers(30, 0)}")
    println(s"Result of checkInteger: ${checkIntergers(20, 15)}")
    println(s"Result of checkInteger: ${checkIntergers(10, 20)}")
    println(s"Result of checkInteger: ${checkIntergers(15, 30)}")
  }

}
