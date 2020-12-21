package com.allaboutscala.chapter.two.tutorial_01

object VariablesBasics_Tutorial extends App {
  println("\nStep 1: Immutable Vriable")
  val donutsToBuy: Int = 5

  println("\nStep 2: Mutable variable")
  var favouriteDonut: String = "Glazed Donut"
  favouriteDonut = "Vanila Donut"

  println("\nStep 3: Lazy evalution")
  lazy val donutService = "initialise some donut service"

  println("\nStep 4: Scala Types")
  val donutsBought: Int = 5

  val bigNumberOfDonuts: Long = 100000000L

  val smallNumberOfDonuts: Short = 1

  val priceOfDonut: Double = 2.50

  val donutPrice: Float = 2.50f

  val donutStoreName: String = "Allaboutscala Donut Store"

  val donutByte: Byte = 0xa

  val donutFirstLetter: Char = 'D'

  val nothing: Unit = ()


  println("\nStep 5: Declare a variable without initialization")
  var leastFavoriteDonut: String = _

  leastFavoriteDonut = "Plain Donut"

}
