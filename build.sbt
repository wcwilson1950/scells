name := "scells"

version := "1.0"

scalaVersion := "2.13.14"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.18" % Test
libraryDependencies += "org.scala-lang.modules" %% "scala-swing" % "3.0.0"
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.3.0"
scalacOptions += "-deprecation"
// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.3"