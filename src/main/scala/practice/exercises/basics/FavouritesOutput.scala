package practice.exercises.basics

object FavouritesOutput extends App {
  val firstName = "Raghu"
  val lastName = "Gundapantula"
  val favoriteMovie = "Anand"
  val output =
    s"""
       | First Name: $firstName
       | Last Name: $lastName
       | Favorite Movie: $favoriteMovie
 """.stripMargin
  println(s"$output")
}
