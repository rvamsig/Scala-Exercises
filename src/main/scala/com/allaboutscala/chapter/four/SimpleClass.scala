package com.allaboutscala.chapter.four

object SimpleClass extends App {
  println("Step 1: Defining a simple class")

  class Donut(name: String, productCode: Long) {
    def print = println(s"Donut Name: $name and Product Code: $productCode")
  }

  println("\nStep 2: How to create instances of Donut class")
  val plainDonut = new Donut("Plain Donut", 126548)
  val glazedDonut = new Donut("Glazed Donut", 956412)

  println("\nStep 3: How to call the print function for each of the donut object")
  plainDonut.print
  glazedDonut.print

  println("\nStep 4: How to access the properties of class Donut")
  /*  glazedDonut.name
    glazedDonut.productCode*/
  /* NOTE:
   - You will get compiler error as we have not exposed the name and productCode properties using getters.
   - We will introduce Case Class in upcoming tutorials to automatically provide accessor methods.*/
}
