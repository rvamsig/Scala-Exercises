package com.allaboutscala.chapter.four

object TypedClass extends App {
  println("Step 1:  How to define an abstract class called Donut ")

  abstract class Donut(name: String) {
    def printName: Unit
  }

  println("\nStep 2: How to extend abstract class Donut and define a case class of Donut called VanillaDonut")

  case class VanillaDonut(name: String) extends Donut(name) {
    override def printName: Unit = println(name)
  }

  println("\nStep 3: How to extend abstract class Donut and define a case class of Donut called GlazedDonut")

  case class GlazedDonut(name: String) extends Donut(name) {
    override def printName: Unit = println(name)
  }

  println("\nStep : How to instantiate Donut objects")
  val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
  vanillaDonut.printName

  val glazedDonut: Donut = GlazedDonut("Glazed Donut")
  glazedDonut.printName

  println("\nStep 5: How to define a ShoppingCart typed class which expects Donut types")

  class ShoppingCart[D <: Donut](donuts: Seq[D]) {
    def printCartItems: Unit = donuts.foreach(_.printName)
  }

  println("\nStep 6: How to create instances or objects of ShoppingCart class")
  val shoppingCart: ShoppingCart[Donut] = new ShoppingCart(Seq[Donut](vanillaDonut, glazedDonut))
  shoppingCart.printCartItems
}
