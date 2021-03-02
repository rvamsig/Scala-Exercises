package practice.exercises.basics

/*
* program to exchange the first and
* last characters in a given string and return the new string
* */
object ExchangeFirstLastChars {
  def exchangeChars(str: String): String = {
    val len = str.length
    if (len <= 1) str
    else str.charAt(len - 1) + str.substring(1, len - 1) + str.charAt(0)
  }

  def main(args: Array[String]): Unit = {
    println(s"result : ${exchangeChars("Scala")}")
    println(s"result : ${exchangeChars("abcd")}")
    println(s"result : ${exchangeChars("xyz")}")
  }
}
