package practice.exercises.basics

/*
* program to convert the last 4 characters of a given string in upper case.
* If the length of the string has less than 4 then uppercase all the characters.
* */
object ConvertStringCase {

  def caseChangeLast4Chars(str: String): String = {
    val strLen = str.length
    str.take(strLen - 4) + str.drop(strLen - 4).toUpperCase()
  }

  def caseChangeLastNChars(str: String, num: Int): String = {
    val strLen = str.length
    str.take(strLen - num) + str.drop(strLen - num).toUpperCase()
  }

  def main(args: Array[String]): Unit = {
    println(s"Converted String: ${caseChangeLast4Chars("scala")}")
    println(s"Converted String: ${caseChangeLast4Chars("abc")}")
    println(s"Converted String: ${caseChangeLast4Chars("Casechange")}")
    println("\n")
    println(s"Converted String: ${caseChangeLastNChars("scala", 4)}")
    println(s"Converted String: ${caseChangeLastNChars("abc", 2)}")
    println(s"Converted String: ${caseChangeLastNChars("Casechange", 5)}")
  }
}
