package practice.exercises.basics

/*
* Get the absolute difference between n and 51.
* If n is greater than 51 return triple the absolute difference
* */
object AbsoluteDiff {
  def absoluteDiff(n: Int, constantVal: Int): Int = {
    val absVal = (n - constantVal).abs
    if (n > constantVal) (absVal) * 3 else absVal
  }

  def main(args: Array[String]): Unit = {
    println(s"Result of the Absolute Diff: ${absoluteDiff(23, 51)}")
    println(s"Result of the Absolute Diff: ${absoluteDiff(93, 51)}")
  }
}
