package practice.exercises.basics

object StringStartingWith {
  def stringStarting(str: String): Boolean = {
    str.startsWith("Sc")
  }

  def main(args: Array[String]): Unit = {
    println(s"Result of the String : ${stringStarting("Scala")}")
    println(s"Result of the String : ${stringStarting("Java")}")
  }
}
