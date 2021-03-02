package com.allaboutscala.chapter.six

object ImmutableList extends App {
  println("Step 1: How to initialize List")
  val list1: List[String] = List("Plain Donut", "Strawberry Donut", "Vanilla Donut")
  println(s"Elements of List: $list1")

  println("\nStep 2: How to access elements of List")
  println(s"Element on Index 0 : ${list1(0)}")
  println(s"Element on Index 1 : ${list1(1)}")
  println(s"Element on Index 2 : ${list1(2)}")

  println("\nStep 3: How to append elements at the end of immutable List using :+")
  val list2: List[String] = list1 :+ "Chocolate Donut"
  println(s"List with appended elements: $list2 ")

  println("\nStep 4: How to prepend elements at the end of immutable List using +:")
  val list3: List[String] = "Glazed Donut" +: list2
  println(s"Prepended elements of the list : $list3")

  println("\nStep 5: How to add two immutable lists together using ::")
  val addList: List[Any] = list1 :: list3
  println(s"Combined List using :: $addList")

  println("\nStep 6:  How to add two immutable Lists together using :::")
  val combinedList: List[Any] = list2 ::: list1
  println(s"Combined List using ::: - $combinedList")

  println("\nStpe 7: How to initialize an empty immutable List")
  val emptyList: List[String] = List.empty[String]
  println(s"Empty list : $emptyList")
}
