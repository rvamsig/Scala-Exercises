package practice.exercises.basics

/*
* program to create a new string which is 4 copies of the 2 front characters
* of a given string.
* If the given string length is less than 2 return the original string.
* */
object ReplicateStrings {
  def replicateStr(str: String, n: Int): String = {
    if (str.length < 2) str
    else str.substring(0, 2) * n
  }

  def main(args: Array[String]): Unit = {
    println(s"Result of replication: ${replicateStr("Scala", 3)}")
    println(s"Result of replication: ${replicateStr("AB", 3)}")
    println(s"Result of replication: ${replicateStr("123", 4)}")
  }
}
