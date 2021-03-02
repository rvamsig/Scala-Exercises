package practice.exercises.basics

object ReverseStringUpper extends App {
  val stringToFormat = "http://allaboutscala.com/scala-exercises"
  println(s"stringToFormat value is : $stringToFormat")

  val reverseStringUpper = stringToFormat.reverse.toUpperCase()
  println(s"reverseStringUpper value is : $reverseStringUpper")
}
