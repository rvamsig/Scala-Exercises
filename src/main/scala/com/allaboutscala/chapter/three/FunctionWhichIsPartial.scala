package com.allaboutscala.chapter.three

object FunctionWhichIsPartial extends App {
  println("Step 1: Review of Pattern Matching in Scala")
  val donutType = "Glazed Donut"
  val tasteLevel = donutType match {
    case "Glazed Donut" | "Strawberry Donut" => "Very Tasty"
    case "Plain Donut" => "Tasty"
    case _ => "Good"
  }
  println(s"Taste of the $donutType : $tasteLevel")


  println("\nStep 2: How to define a Partial Function named isVeryTasty")
  val isVeryTasty: PartialFunction[String, String] = {
    case "Glazed Donut" | "Strawberry Donut" => "Very Tasty"
  }

  println("\nStep 2 : How to Call the partial function")
  println(s"Calling the partial funtion: ${isVeryTasty("Glazed Donut")}")

  val isTasty: PartialFunction[String, String] = {
    case "Plain Donut" => "Tasty"
  }

  val unknownTaste: PartialFunction[String, String] = {
    case donut@_ => s"Unknown taste for donut= $donut"
  }
  println("\nStep 5: How to compose PartialFunction using orElse")
  val donutTaste = isVeryTasty orElse isTasty orElse unknownTaste
  println(donutTaste("Glazed Donut"))
  println(donutTaste("Plain Donut"))
  println(donutTaste("Chocolate Donut"))
}