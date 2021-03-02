package practice.exercises.array

/*
* program to remove a specific element from an given array.
* Note: The size of an Array can't be changed, so we can't directly delete elements
*  from an array but replace them with "" / null etc.
* */
object RemoveCertainVal {
  def replaceCertainValue(arr: Array[String], num: Int): String = {
    arr(num) = ""
    var arry: String = ""
    for (i <- 0 to arr.length - 1) {
      arry += arr(i)
    }
    arry
  }


  def main(args: Array[String]): Unit = {
    println(s"Result: ${replaceCertainValue(Array("Red", "Blue", "Black", "Green", "White"), 4)}")
  }
}
