package com.allaboutscala.chapter.four

object CompanionObjectFields extends App {

  println("Step 1: 1. How to define a simple class to represent a Donut object")

  class Donut(name: String, productCode: Option[Long] = None) {
    def print = println(s"Donut Name = $name, Product Code = ${productCode.getOrElse(0)}, uuid = ${Donut.uuid}")
  }

  println("\nStep 2 : How to declare fields and values in Companion Object")

  object Donut {
    private val uuid = 1

    def apply(name: String, productCode: Option[Long] = None): Donut = {
      new Donut(name, productCode)
    }

    def apply(name: String): Donut = {
      new Donut(name)
    }
  }

  println("\nStep 3: How to create instances of the Donut class using the Companion Object")
  val glazedDonut = Donut("Glazed Donut", Some(1235))
  val vanilaDonut = Donut("Vanilla Donut")

  println("\nStep 4: How to call function on each Donut object")
  glazedDonut.print
  vanilaDonut.print

}
