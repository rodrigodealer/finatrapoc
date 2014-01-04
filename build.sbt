name := "finatra-poc"

version := "1.0"

scalaVersion := "2.10.3"

resolvers ++= Seq(
  "twttr" at "http://maven.twttr.com",
  "spray nightlies repo" at "http://nightlies.spray.io"
)

libraryDependencies ++= Seq(
  "com.twitter" % "finatra" % "1.4.0",
  "com.scalapenos" % "riak-scala-client_2.10" % "0.8.3.2",
  "io.spray" % "spray-json_2.10" % "1.2.5",
  "org.scalatest" % "scalatest_2.10.0" % "2.0.M5" % "test"
)

//scalacOptions in Test ++= Seq("-Yrangepos")