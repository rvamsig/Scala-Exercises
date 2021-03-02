package practice.exercises.basics

object RepeatGivenStringNTimes {
  def repeatGivenString(str: String, num: Int): String = {
    str * num
  }


  def main(args: Array[String]): Unit = {
    println(s"Repeated String : ${repeatGivenString("Scala", 5)}")
  }
}
