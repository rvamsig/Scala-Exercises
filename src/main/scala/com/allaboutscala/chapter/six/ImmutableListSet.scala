package com.allaboutscala.chapter.six

import scala.collection.immutable.ListSet

object ImmutableListSet extends App {
  println("Step 1: How to initialize an immutable ListSet with 3 elements")
  val listSet1: ListSet[String] = ListSet("Plain Donut", "Strawberry Donut", "Chocolate Donut")
  println(s"Elements of listSet1 = $listSet1")

  println("\nStep 2: How to check elements of immutable ListSet")
  println(s"Element plain donut: ${listSet1("Plain Donut")}")
  println(s"Element vanilla donut: ${listSet1("Vanilla Donut")}")
  println(s"Element Strawberry donut: ${listSet1("Strawberry Donut")}")
  println(s"Element Chocolate donut: ${listSet1("Chocolat Donut")}")

  println("\nStep 3: How to add elements of immutable ListSet using +")
  val listSet2: ListSet[String] = listSet1 + "Vanilla Donut"
  println(s"Adding element Vanilla to ListSet using + = $listSet2")

  println("\nStep 4: How to add two ListSet together using ++")
  val listSet3: ListSet[String] = listSet1 ++ ListSet("Glazed Donut")
  println(s"Add two lists together using ++ = $listSet3")

  println("\nStep 5: How to remove element from the ListSet using -")
  val listSet4: ListSet[String] = listSet1 - ("Plain Donut")
  println(s"ListSet without the element Plain Donut = $listSet4")

  println("\nStep 6: How to initialize an empty ListSet")
  val emptyListSet: ListSet[String] = ListSet.empty[String]
  println(s"Empty ListSet of type String = $emptyListSet")
}


