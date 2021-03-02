package practice.exercises.basics

object RemoveCharFromPosition {
  def removeChar(str: String, pos: Int): String = {
    println(s"Pos: ${str.take(pos)}")
    println(s"Pos+1 : ${str.drop(pos + 1)}")
    println("-----------")
    str.take(pos) + str.drop(pos + 1)
  }

  def main(args: Array[String]): Unit = {
    println("Result: " + removeChar("Scala", 1));
    println("Result: " + removeChar("Scala", 0));
    println("Result: " + removeChar("Scala", 4));
  }
}
