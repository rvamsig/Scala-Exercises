package practice.exercises.basics

/*
*
* program to create a new string taking the first 3 characters of a given
* string and return the string with the 3 characters added at both the front and back.
* If the given string length is less than 3, use whatever characters are there.
*
* */
object AppendString2 {
  def appendStr(str: String): String = {
    val len = str.length
    val firstThreeChars = if (len < 3) str else str.substring(0, 3)
    firstThreeChars + str + firstThreeChars
  }

  def main(args: Array[String]): Unit = {
    println(s"Result of appended String: ${appendStr("Scala")}")
    println(s"Result of appended String: ${appendStr("12")}")
    println(s"Result of appended String: ${appendStr("XYZM")}")
  }
}
