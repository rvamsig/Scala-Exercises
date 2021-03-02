package practice.exercises.basics

object CheckNumberRanges {
  def checkNumberRanges(num1: Int, num2: Int): Boolean = {
    ((num1 >= 40 && num1 <= 50) && (num2 >= 40 && num2 <= 50)) ||
      ((num1 >= 50 && num1 <= 60) && (num2 >= 50 && num2 <= 60))
  }

  def checkListOfValuesInRange(num1: Int, num2: Int): Boolean = {
    List(num1, num2).forall { m => m >= 40 && m <= 50 } ||
      List(num1, num2).forall { m => m >= 50 && m <= 60 }
  }

  def main(args: Array[String]): Unit = {
    println(s"Check the range of the given numbers : ${checkNumberRanges(41, 45)}")
    println(s"Check the range of the given numbers : ${checkNumberRanges(51, 55)}")
    println(s"Check the range of the given numbers : ${checkNumberRanges(56, 45)}")
    println("---------------------------------------------")
    println(s"Check the range of the given numbers : ${checkListOfValuesInRange(41, 45)}")
    println(s"Check the range of the given numbers : ${checkListOfValuesInRange(51, 55)}")
    println(s"Check the range of the given numbers : ${checkListOfValuesInRange(56, 45)}")
  }
}
