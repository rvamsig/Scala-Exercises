package com.allaboutscala.chapter.three

object FunctionWhichIsTyped extends App {

  println("Step 1: How to define a function which takes a String as parameter")

  def applyDiscount(couponCode: String) {
    println(s"Lookup percentage discount in database for: $couponCode")
  }

  println("\nStep 2: Defining function that takes a parameter of type Double")

  def applyDiscount(percentageDiscount: Double) {
    println(s"$percentageDiscount discount will be applied ")
  }

  println("\nStep 3: Calling applyDiscount functions with String and Double parameters")
  applyDiscount("Coupon_1234")
  applyDiscount(10.2)

  println("\nStep 4: How to define a generic typed function which will specify the type of its parameter")

  def applyDiscount[T](discount: T) {
    discount match {
      case d: String =>
        println(s"Lookup for discount in database: $d")
      case d: Double =>
        println("$d discount will be applied")
      case _ =>
        println("Unsupported discount type")
    }
  }
  println("\nStep 5: Calling the generic applyDiscount function")
  applyDiscount[String]("Coupon_321")
  applyDiscount[Double](9.5)
}
