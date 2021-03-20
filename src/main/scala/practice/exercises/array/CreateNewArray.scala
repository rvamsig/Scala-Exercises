package practice.exercises.array

/*
* Write a Scala program to create a new array taking the middle element from three arrays of length 5.
* */
object CreateNewArray {
  def selectMiddleElements(arr1: Array[Int], arr2: Array[Int], arr3: Array[Int]): Array[Int] =
    if (arr1.length != 5 || arr2.length != 5 || arr3.length != 5) throw new IllegalArgumentException("Arguments are passed don't suffice ")
    else {
      val arr1Len = arr1.length
      val arr2Len = arr2.length
      val arr3Len = arr3.length

      val arr1MiddleElement = arr1((arr1Len % 2) + 1)
      println(s"$arr1MiddleElement")
      val arr2MiddleElement = arr2((arr2Len % 2) + 1)
      println(s"$arr2MiddleElement")
      val arr3MiddleElement = arr3((arr3Len % 2) + 1)
      println(s"$arr3MiddleElement")

      Array(arr1MiddleElement, arr2MiddleElement, arr3MiddleElement)
    }

  def main(args: Array[String]): Unit = {
    val arrOfMiddleElements = selectMiddleElements(Array(1, 2, 3, 4, 5), Array(2, 3, 4, 5, 6), Array(3, 4, 5, 6, 7))
    println(s"Array of Middle elements of the Arrays is : $arrOfMiddleElements")
  }
}
