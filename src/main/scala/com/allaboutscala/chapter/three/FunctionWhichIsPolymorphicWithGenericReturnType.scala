package com.allaboutscala.chapter.three

object FunctionWhichIsPolymorphicWithGenericReturnType extends App {
  println("Step 1: Creating a Polymorphic function with generic return type")

  def applyDiscount[T](discount: T) {
    discount match {
      case d: String =>
        println(s"Lookup for discount in database: $d")
      case d: Double =>
        println(s"$d discount will be applied")
      case _ =>
        println("Unsupported discount type")
    }
  }

  println("\nStep 2 : Calling the function with typed parameters")
  applyDiscount[String]("Coupon_123")
  applyDiscount[Double](10)

  def applyDiscountWithReturnType[T](discount: T): Seq[T] = {
    discount match {
      case d: String =>
        println(s"Lookup percentage in database: $d")
        Seq[T](discount)

      case d: Double =>
        println(s"$d discount will be applied")
        Seq[T](discount)

      case d @ _ =>
        println("Unsupported discount type")
        Seq[T](discount)
    }
  }

  println("\nStep 4: How to call a generic typed function which also has a generic return type")
  println(s"Result of applyDiscountWithReturnType with String parameter = ${applyDiscountWithReturnType[String]("COUPON_123")}")

  println()
  println(s"Result of applyDiscountWithReturnType with Double parameter = ${applyDiscountWithReturnType[Double](10.5)}")

  println()
  println(s"Result of applyDiscountWithReturnType with Char parameter = ${applyDiscountWithReturnType[Char]('U')}")

}
