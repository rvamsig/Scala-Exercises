package practice.exercises.basics

/*
* program to check a given integer and return true if it is within 20 of 100 or 300
* */
object NumberWithInCertainRange {

  def checkRange(x: Int): Boolean = {
    (100 - x).abs <= 20 || (300 - x).abs <= 20
  }

  def main(args: Array[String]): Unit = {
    println(s"Range of the number: ${checkRange(152)}")
    println(s"Range of the number: ${checkRange(256)}")
    println(s"Range of the number: ${checkRange(568)}")
    println(s"Range of the number: ${checkRange(56)}")
    println(s"Range of the number: ${checkRange(86)}")
  }

}
