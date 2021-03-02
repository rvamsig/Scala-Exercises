package com.allaboutscala.chapter.six

object ImmutableListMap extends App {
  println("Step 1:How to initialize a ListMap with 3 elements using key -> value notation")

  import scala.collection.immutable.ListMap

  val listMap: ListMap[String, String] = ListMap("PD" -> "Plain Donut", "VD" -> "Vanilla Donut", "CD" -> "Chocolate Donut")
  println(s"Elements of listMap: $listMap")

  println("\nStep 2: How to access elements by specific key in the ListMap")
  println(s"Element by key PD = ${listMap("PD")}")
  println(s"Element by key VD = ${listMap("VD")}")

  println("\nStep 3: How to add elements to ListMap using +")
  val listMap2: ListMap[String, String] = listMap + ("KD" -> "Krispy Kreme Donut")
  println(s"Elements of listMap2 = $listMap2")

  println("\nStep 3: How to add 2 ListMap together")
  val listMap3: ListMap[String, String] = listMap ++ listMap2
  println(s"Adding 2 ListMap together = $listMap3")

  println("\nStep 5: How to remove key and value from ListMap using -")
  val listMap4: ListMap[String, String] = listMap - ("CD")
  println(s"ListMap without the key CD and its value = $listMap4")

  println("\nStep 6: How to initialize an empty ListMap")
  val emptyListMap: ListMap[String, String] = ListMap.empty[String, String]
  println(s"Empty ListMap with key type String and value also of type String= $emptyListMap")
}
