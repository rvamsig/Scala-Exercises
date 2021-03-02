package practice.exercises.basics

/*
* program to create a new string with the last
* char added at the front and back of a given string of length 1 or more.
* */
object AppendChar {
  def appendedStr(str: String): String = {
    val lengthStr = str.length
    val lastChar = str.charAt(lengthStr - 1)
    lastChar + str + lastChar
  }

  def main(args: Array[String]): Unit = {
    println(s"Result of appended String: ${appendedStr("Scala")}")
    println(s"Result of appended String: ${appendedStr("123")}")
    println(s"Result of appended String: ${appendedStr("X")}")
  }
}
