organization := "Jorja"

name := "HelloWorld"

scalaVersion := "2.11.2"


version := "0.1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-server" % "9.2.2.v20140723"
  // "net.databinder" %% "unfiltered-jetty" % "0.6.4",
  // "org.clapper" %% "avsl" % "0.3.6",
  // "net.databinder" %% "unfiltered-spec" % "0.6.4" % "test",
  // "org.specs2" %% "specs2" % "1.12.3" % "test"
)

resolvers ++= Seq(
  "java m2" at "http://download.java.net/maven/2"
)