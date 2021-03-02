package practice.exercises.basics

object CheckASubstring {
  def checkSubstring(str: String): String = {
    if (str.drop(1).startsWith("yt")) str.replaceFirst("yt", "")
    else str
  }

  def main(args: Array[String]): Unit = {
    println("Result of the string: " + checkSubstring("Scala"))
    println("Result of the string: " + checkSubstring("Sytcala"))
    println("Result of the string: " + checkSubstring("yytade"))

  }
}
