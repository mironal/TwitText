import AssemblyKeys._

name := "TwitText"

organization := "com.github.mironal.twitter"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
  "org.twitter4j" % "twitter4j-core" % "3.0.3",
  "org.specs2" %% "specs2" % "1.13" % "test"
)

initialCommands := "import com.github.mironal.twitter.twittext._"

assemblySettings

jarName in assembly :=  "twitText.jar"
