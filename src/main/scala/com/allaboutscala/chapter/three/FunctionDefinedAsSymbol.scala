package com.allaboutscala.chapter.three

object FunctionDefinedAsSymbol extends App {

  println("Step 1: How to create and instantiate a class")
  val donutCostCalculator = new DonutCostCalculator()

  println("\nStep 2: How to call a function from an instantiated class")
  println(s"Calling minusDiscount() function = ${donutCostCalculator.minusDiscount(10.5)}")

  println("\nStep 4: How to call function whose name is just the symbol -")
  println(s"Calling function - = ${donutCostCalculator.-(10.5)}")

  println("\nStep 5: How to call a function using the operator style notation")
  println(s"Calling function - with operator style notation = ${donutCostCalculator - 10.5}")
}

class DonutCostCalculator {
  //Hard-coded for simplicity
  val totalCost = 100

  def minusDiscount(discount: Double): Double = {
    totalCost - discount
  }

  // Step 3: How to define function whose name is just the symbol minus -
  def -(discount: Double): Double = {
    totalCost - discount
  }

  // Step 6: How to define function whose name is just the symbols +++
  def +++(taxAmount: Double): Double = {
    totalCost + taxAmount
  }
}
