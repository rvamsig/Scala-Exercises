package com.allaboutscala.chapter.one.tutorial_10

import com.typesafe.scalalogging.LazyLogging

object HelloWorldWithScalaLogging extends App with LazyLogging {
  logger.info("\n Hello World from Scala Logging")
}
