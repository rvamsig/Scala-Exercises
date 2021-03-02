package practice.exercises.basics

object CheckSpecificString {

  def checkSpecificString(str: String): String = {
    if (str.startsWith("if")) str else "if " + str
  }

  def main(args: Array[String]): Unit = {
    println(s"String is : ${checkSpecificString("Hello, world")}")
    println(s"String is : ${checkSpecificString("if world, Hello")}")
  }
}
