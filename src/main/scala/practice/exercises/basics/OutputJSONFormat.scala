package practice.exercises.basics

object OutputJSONFormat extends App {
  val donutName: String = "Vanilla Donut"
  val quantityPurchased: Int = 10
  val price: Double = 2.5

  val donutJson =
    s"""
       |{
       |"donut_name":"$donutName",
       |"quantity_purchased":"$quantityPurchased",
       |"price": $price

       |""".stripMargin

  println(s"Data in JSON format : $donutJson")
}
