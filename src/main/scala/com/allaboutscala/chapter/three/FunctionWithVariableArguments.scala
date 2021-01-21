package com.allaboutscala.chapter.three

object FunctionWithVariableArguments extends App {
  def printReport(names: String*) {
    println(s"""Donut Report = ${names.mkString(" - ")}""")
  }

  println("\nStep 2: Calling the function which takes variable number of String arguments")
  printReport("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
  printReport("Chocolate Donut")


  println("\nStep 3: Passing a List to a function with variable number of arguments")
  val listDonuts: List[String] = List("Glazed Donut", "Strawberry Donut", "Vanilla Donut")
  // printReport(listDonuts) this function call will give compilation error

  //Calling the function using Type ascription
  printReport(listDonuts:_*)

  println("\nStep 4: Passing a Sequence to a function with variable number of arguments")
  val seqDonuts: Seq[String] = Seq("Chocolate Donut", "Plain Donut")
  // printReport(listDonuts) this function call will give compilation error

  //Calling the function using Type ascription
  printReport(seqDonuts:_*)

  println("\nStep 5: Passing an Array to a function with variable number of arguments")
  val arrDonuts: Array[String] = Array("Coconut Donut")
  // printReport(arrDonuts)

  ////Calling the function using Type ascription
  printReport(arrDonuts: _*)
}
