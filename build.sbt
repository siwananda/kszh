name := """krazehspizeh"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  //Mongo capability dependencies
  "org.mongodb" % "mongo-java-driver" % "2.12.2",
  //Morphia dependencies
  "org.mongodb.morphia" % "morphia" % "0.108",
  "org.mongodb.morphia" % "morphia-logging-slf4j" % "0.108",
  "org.mongodb.morphia" % "morphia-validation" % "0.108",
  //easier way to get public libraries
  "org.webjars" %% "webjars-play" % "2.3.0-2",
  //Bootstrap
  "org.webjars" % "bootstrap" % "3.3.1",
  //jQuery
  "org.webjars" % "jquery" % "1.11.1",
  javaJdbc,
  javaEbean,
  cache,
  javaWs
)
