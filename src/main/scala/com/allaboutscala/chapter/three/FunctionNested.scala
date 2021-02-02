package com.allaboutscala.chapter.three

object FunctionNested extends App {
  println("Step 1: How to define a function")

  def checkDonutAvailability(donutName: String): Boolean = {
    val listDonutFromStock: List[String] = List("Glazed Donut", "Strawberry Donut", "Plain Donut", "Vanilla Donut")

    val iDonutInStock = (donutName.nonEmpty && donutName.length > 0) && (listDonutFromStock contains (donutName))
    iDonutInStock
  }

  println("\nStep 2: How to call the nested function")
  println(s"Check if the donut is available : ${checkDonutAvailability("Plain Donut")}")
  println("\nStep 3: How to define nested function")

  def checkDonutAvailabilityWithNestedFunction(donName: String): Boolean = {
    val listDonutFromStock: List[String] = List("Glazed Donut", "Strawberry Donut", "Plain Donut", "Vanilla Donut")

    //Defining the function using val instead of def. Will not have return type
    val validate = (name: String) => {
      name.nonEmpty && name.length > 0
    }

    // first run the validate function and then check if the donut in stock
    val iDonutInStock = validate(donName) && (listDonutFromStock contains donName)
    iDonutInStock

  }

  println("\nStep 4: How to call a Nested Function")
  println(s"Calling checkDonutAvailabilityWithNestedFunction with Vanilla Donut = ${checkDonutAvailabilityWithNestedFunction("Vanilla Donut")}")
}
