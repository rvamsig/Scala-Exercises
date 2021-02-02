package com.allaboutscala.chapter.four

object CompanionObject extends App {
  println("Step 1: How to define a simple class to represent a Donut object")

  class Donut(name: String, productCode: Long) {
    def print = println(s"Donut Name : $name and Product Name = $productCode")
  }

  println("\nStep 2: How to declare a companion object for the Donut class")

  object Donut {
    def apply(name: String, productCode: Long): Donut = {
      new Donut(name, productCode)
    }
  }

  println("\nStep 3: How to create instances of Donut class")
  val plainDonut = Donut("Plain Donut", 126548)
  val glazedDonut = Donut("Glazed Donut", 956412)

  println("\nStep 4: Calling the print function of the class")
  plainDonut.print
  glazedDonut.print


}
