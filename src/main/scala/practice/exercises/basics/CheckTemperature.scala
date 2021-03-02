package practice.exercises.basics

/*
* Scala program to check whether one of the given temperatures
* is less than 0 and the other is greater than 100
* */
object CheckTemperature {
  def checkTempRange(temp1: Double, temp2: Double): Boolean = {
    (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)
  }

  def main(args: Array[String]): Unit = {
    println(s"Checking the temperature : ${checkTempRange(0, 101)}")
    println(s"Checking the temperature : ${checkTempRange(20, 120)}")
    println(s"Checking the temperature : ${checkTempRange(-1, 121)}")
    println(s"Checking the temperature : ${checkTempRange(102, -6)}")
  }
}
