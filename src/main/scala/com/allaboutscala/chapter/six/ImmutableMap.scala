package com.allaboutscala.chapter.six

object ImmutableMap extends App {
  println("Step 1: How to initialize a Map with 3 elements")
  val map1: Map[String, String] = Map(("PD", "Plain Donut"), ("VD", "Vanilla Donut"), ("GD", "Glazed Donut"))
  println(s"Elements of Map: $map1")

  println("\nStep 2: How to initialize Map using key -> value notation")
  val map2: Map[String, String] = Map("VD" -> "Vanilla Donut", "GD" -> "Glazed Donut")
  println(s"Elements of map1 = $map2")

  println("\nStep 3: How to access elements by specific value")
  println(s"Element of VD : ${map1("VD")}")
  println(s"Element of PD : ${map1("PD")}")
  println(s"Element of GD : ${map1("GD")}")

  println("\nStep 4: How to add elements using +")
  val map3: Map[String, String] = map1 + ("CD" -> "Chocolate Donut")
  println(s"Elements added to map using + : $map3 ")

  println("\nStep 4: How to add elements using ++")
  val map4: Map[String, String] = map2 ++ map3
  println(s"Elements added to map using + : $map4 ")

  println("\nStep 6: How to remove key and its value from map using -")
  val map5: Map[String, String] = map4 - ("CD")
  println(s"Map without the key CD and its value = $map5")

  println("\nStep 7: How to initialize an empty Map")
  val emptyMap: Map[String, String] = Map.empty[String, String]
  println(s"Empty Map = $emptyMap")
}
