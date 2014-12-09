name := """krazehspizeh"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "org.mongodb" % "mongo-java-driver" % "2.12.2",
  "org.mongodb.morphia" % "morphia" % "0.108",
  "org.mongodb.morphia" % "morphia-logging-slf4j" % "0.108",
  "org.mongodb.morphia" % "morphia-validation" % "0.108",
  "org.webjars" % "bootstrap" % "3.0.2",
  javaJdbc,
  javaEbean,
  cache,
  javaWs
)
