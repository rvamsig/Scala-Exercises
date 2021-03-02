package practice.exercises.basics

object DonutPrice extends App {

  val glazedDonutPrice: Double = 2.50

  def totalCost(qnty: Int, price: Double): Double = {
    val totalCostOfDonut: Double = ((qnty * price) % 1.2f)
    totalCostOfDonut
  }

  val cost = totalCost(10, glazedDonutPrice)
  println("Total Price for donuts: ${cost}")

  val glazedDonut = "Glazed Donut"
  val unitPrice = 2.50
  val qtyPurchased = 10
  val totalCost = qtyPurchased * unitPrice

  println(f"""Total cost of $qtyPurchased $glazedDonut${if (qtyPurchased > 1) "s" else ""} = $$$totalCost%1.2f""")

}
