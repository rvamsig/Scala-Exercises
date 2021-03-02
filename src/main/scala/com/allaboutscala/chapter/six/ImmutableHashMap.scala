package com.allaboutscala.chapter.six

import scala.collection.immutable.HashMap

object ImmutableHashMap extends App {
  println("Step 1: How to initialize a HashMap with 3 elements using Tuples of key and value")
  val hashMap: HashMap[String, String] = HashMap(("PD", "Plain Donut"), ("SD", "Strawberry Donut"), ("CD", "Chocolate Donut"))
  println(s"Elements of the HashMap : $hashMap")

  println("Step 2: How to initialize a HashMap with 3 elements using key and value")
  val hashMap2: HashMap[String, String] = HashMap("PD" -> "Plain Donut", "SD" -> "Strawberry Donut", "CD" -> "Chocolate Donut")
  println(s"Elements of the HashMap : $hashMap2")

  println("\nStep 3: How to access elements by specific key in the HashMap")
  println(s"Element by key PD = ${hashMap2("PD")}")
  println(s"Element by key CD = ${hashMap2("CD")}")

  println("\nStep 4: How to add elements to HashMap using +")
  val hashMap3: HashMap[String, String] = hashMap + ("KD" -> "Krispy Kreme Donut")
  println(s"Element in hashMap3 = $hashMap3")

  println("\nStep 5: How to add two HashMap together using ++")
  val hashMap4: Map[String, String] = hashMap ++ hashMap2
  println(s"Elements in hashMap4 = $hashMap4")

  println("\nStep 6: How to remove key and its value from HashMap using -")
  val hashMap5: Map[String, String] = hashMap4 - ("CD")
  println(s"HashMap without the key CD and its value = $hashMap5")

  println("\nStep 7: How to initialize an empty HashMap")
  val emptyHashMap: HashMap[String, String] = HashMap.empty[String, String]
  println(s"Empty HashMap = $emptyHashMap")
}
