package practice.exercises.array

/*
* program to find the maximum and minimum value of an array of integers.
* */
object MaxAndMin {
  def maxOfArray(arr:Array[Int]): Int = {
    arr.max
  }

  def minOfArray(arr:Array[Int]): Int = {
    arr.min
  }

  def main(args: Array[String]): Unit = {
    val arrayVals: Array[Int]= Array(1,2,3,8,9,4,6)
    println(s"Elements of the array are: ${arrayVals.mkString(",")}")
    println(s"Max of the Array is: ${maxOfArray(arrayVals)}")
    println(s"Min of the Array is: ${minOfArray(arrayVals)}")
  }
}
