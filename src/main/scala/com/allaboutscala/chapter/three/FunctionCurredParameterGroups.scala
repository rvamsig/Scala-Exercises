package com.allaboutscala.chapter.three

object FunctionCurredParameterGroups extends App {
  println("Step 1 How to define function with Curried Parameter Groups")

  def totalCost(donutType: String)(quantity: Int)(discount: Double): Double = {
    println(s"Calculating total cost for $quantity $donutType with ${discount * 100}   % discount")
    val totalCost = 2.50 * quantity
    totalCost - (totalCost * discount)
  }

  println("\nStep 2: How to call a function with curried parameter groups")
  println(s"Total cost = ${totalCost("Glazed Donut")(10)(0.1)}")

}