name := """scala-berlin-clock-kata"""

version := "1.0"

scalaVersion := "2.11.6"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "codes.reactive" %% "scala-time" % "0.3.0-SNAPSHOT",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "ch.qos.logback" % "logback-classic" % "1.1.2",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0")



// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

