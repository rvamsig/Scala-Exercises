package practice.exercises.basics

object RepeatingSubstring {
  def checkRepeatingStringCount(str: String): Boolean = {
    val subStringcnt = str.count { n => n == 'z' }
    2 <= subStringcnt && subStringcnt <= 4
  }

  def main(args: Array[String]): Unit = {
    println(s"Checking count of substring: ${checkRepeatingStringCount("Razhuzhu")}")
    println("Result: " + checkRepeatingStringCount("zane"));
    println("Result: " + checkRepeatingStringCount("Zazz"));
    println("Result: " + checkRepeatingStringCount("false"));
  }
}
