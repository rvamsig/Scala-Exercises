package com.allaboutscala.chapter.three

object CreateAndUseFunction extends App {

  def favoriteDonut() : String = {
    "Glazed Donut"
  }

  val myFavoriteDonut = favoriteDonut()
  println(s"My favorite donut is : $myFavoriteDonut")

  println("\nStep 2: How to define and use a function with no parenthesis")
  def leastFavoriteDonut = "Plain Donut"
  println(s"My least favorite donut is $leastFavoriteDonut")

  println("\nStep 3: How to define and use a function with no return value")
  def printDonutSalesReport() : Unit = {
    println("Printing Donut sales report.. Done!")
    }
  printDonutSalesReport()

  println("\nStep 4: Use type inference to define function with no return type")
  def printReport() {
    // lookup sales data in database and create some report
    println("Printing donut report... done!")
  }
  printReport()

}
