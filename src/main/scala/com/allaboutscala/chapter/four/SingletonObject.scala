package com.allaboutscala.chapter.four

object SingletonObject extends App {
  println("Step 1: How to declare Singleton Objects")

  object DonutShoppingCart {

    println("\nStep  2: Defining a global field")
    val discount: Double = 0.01

    println("\nStep 3: How to define utility function called calculateTotalCost")

    def calculateTotalCost(donuts: List[String]): Double = {
      //calculate cost of donut
      return 1
    }

  }

  println("\nStep 4: How to call global discount field from Step 2")
  println(s"Global discount : ${DonutShoppingCart.discount}")

  println("\nStep 5: How to call calculateTotalCost from Step 3")
  println(s"Calculate total cost of the donuts : ${DonutShoppingCart.calculateTotalCost(List())}")

}
