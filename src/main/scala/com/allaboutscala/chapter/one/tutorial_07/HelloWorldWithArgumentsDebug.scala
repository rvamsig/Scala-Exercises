package com.allaboutscala.chapter.one.tutorial_07

object HelloWorldWithArgumentsDebug extends App {

  Console.println("Hello World With Arguments Scala Application!")

  Console.println("Command line arguments are: ")
  Console.println(args.mkString(", "))

}
