package practice.exercises.string

/*
*  Write a Scala program to get the character at the given index within a given String.
* Also print the length of the string. Go to the editor
  Sample Output:
  Original String = Scala Exercises!
  The character at position 0 is S
  The character at position 10 is c
  The character at position 15 is !
  Length of the string: 16
* */

object CharAtGivenIndex {
  def charAtGivenIndex(str: String, index: Int): Char = {
    println(s"\nLength of the String: ${str.length}")
    str.charAt(index)
  }

  def main(args: Array[String]): Unit = {
    println(s"Character at the given index: ${charAtGivenIndex("Welcome to", 5)}")
    println(s"Character at the given index: ${charAtGivenIndex("Scala", 4)}")
    println(s"Character at the given index: ${charAtGivenIndex("Programming", 0)}")
    println("\n-----")
    println(s"Character at the given index: ${charAtGivenIndex("Scala Exercises!", 0)}")
    println(s"Character at the given index: ${charAtGivenIndex("Scala Exercises!", 10)}")
    println(s"Character at the given index: ${charAtGivenIndex("Scala Exercises!", 15)}")
  }
}
