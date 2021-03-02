package practice.exercises.string

/*
*
* Write a Scala program to get the character (Unicode code point) at the given index within the String. Go to the editor
Sample Output:
* Original String : w3resource - Scala
* Character(unicode point) = 51
* Character(unicode point) = 101
*
* * */
object CharAtGivenIndexUnicode {
  def charAtGivenIndexUnicode(str: String, indexAt: Int): Int = {
    println(s"Original String: $str")
    str.codePointAt(indexAt)
  }

  def main(args: Array[String]): Unit = {
    println(s"Unicode of the character at given index: ${charAtGivenIndexUnicode("Resource - Scala", 1)}")
    println(s"Unicode of the character at given index: ${charAtGivenIndexUnicode("Resource - Scala", 9)}")
  }
}
