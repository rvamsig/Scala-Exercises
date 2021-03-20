package com.allaboutscala.chapter.seven

object MutableArray_Tutorial extends App {
  println("Step 1: How to initialize a String Array with 3 elements")
  val arrayVal: Array[String] = Array("Plain Donut", "Vanilla Donut", "Strawberry Donut")
  println(s"Elements of array are: ${arrayVal.mkString(",")}")

  println("\nStep 2: How to elements of Array with 3 elements")
  println(s"Element at index 0 :${arrayVal(0)}")
  println(s"Element at index 1 :${arrayVal(1)}")
  println(s"Element at index 2 :${arrayVal(2)}")

  println("\nStep 3: How to initialize an Array by specifying it's capacity")
  val arrayVal2: Array[String] = new Array(3)
  arrayVal2(0) = "Welcome"
  arrayVal2(1) = "to"
  arrayVal2(2) = "Scala programming!"
  println(s"\nElements of arrayVal2 are: ${arrayVal2.mkString(",")}")

  println("\nStep 4: How to create a 2D Array (2 dimension array)")
  val rows = 2
  val cols = 2
  val array2Dim: Array[Array[String]] = Array.ofDim[String](rows, cols)
  array2Dim(0)(0) = "Glazed"
  array2Dim(0)(1) = "Donut"
  array2Dim(1)(0) = "Strawberry"
  array2Dim(1)(1) = "Donut"
  println(s"Elements of a 2 dimensional array: ${array2Dim.deep.toList}")

  println("\nStep 5: How to create 3D Array (3 Dimension Array) using Array.ofDim() method")
  val array3Dim: Array[Array[String]] = Array.ofDim[String](3, 3)
  println(s"Elements of a 3 dimensional array: ${array3Dim.deep.toList}")

  println("\nStep 6: How to create an Array using tabulate function")
  val arrayTabulate: Array[Int] = Array.tabulate(5)(_ + 1)
  println(s"Elements of arrayTabulate: ${arrayTabulate.toList}")

  println("\nStep 7: How to create dimensional Arrays using tabulate function")
  val row1 = 1
  val column3 = 3
  val arrayOfOneRowAndThreeColumns = Array.tabulate(row1, column3)( (row, column) => row + column )
  println(s"Array with 1 row and 3 columns = ${arrayOfOneRowAndThreeColumns.deep.toString}")

  val row2 = 2
  val arrayOfTowRowsAndThreeColumns = Array.tabulate(row2, column3)( (row, column) => row + column )
  println(s"Array with 2 rows and 3 columns = ${arrayOfTowRowsAndThreeColumns.deep.toString}")

  println("\nStep 8: How to create Array using Range")
  val arrayRange: Array[Int] = (1 to 10).toArray
  println(s"Elements of Array created using range: ${arrayRange.mkString(",")} ")

  println("\nStep 9: How to copy an Array using Array.copy")
  val copyArray: Array[Int] = new Array[Int](arrayRange.size)
  Array.copy(arrayRange, 0, copyArray, 0, arrayRange.size)
  println(s"Elements of the copied Array are: ${copyArray.mkString(",")}")

  println("\nStep 10: How to clone an Array")
  val cloneArray = arrayRange.clone()
  println(s"Elements of the cloned array: ${cloneArray.mkString(",")}")
  cloneArray(0) = 10
  println(s"Elements of the cloned array: ${cloneArray.mkString(",")}")

  println("\nStep 11: How to iterate over an Array using for comprehension")
  for(i<- arrayVal)
    {
      println(s"$i")
    }

  println("\nStep 12: How to merge two Arrays using Array.concat")
  val moreDonutArray: Array[String]= Array("Glazed Donut", "Chocolate Donut")
  val mergeArrays: Array[String] = Array.concat(arrayVal, moreDonutArray)
  println(s"Elements of Merged Array: ${mergeArrays.mkString(",")}")

  println("\nStep 13: How to check if two Arrays are equal")
  val arrayToCompare = Array[String]("Plain Donut", "Vanilla Donut", "Strawberry Donut")

  println(s"using == ${arrayVal == moreDonutArray}") // prints false
  println(s"using == ${arrayVal == arrayToCompare}") // ALSO prints false ??? what ... be careful
  println(s"using sameElement function = ${arrayVal sameElements arrayToCompare}") // NOW this works and returns true!

  println("\nStep 14: How to check if two Arrays are equal using deep function and == ")
  println(s"using deep function = ${arrayVal.deep == arrayToCompare.deep}")

}
