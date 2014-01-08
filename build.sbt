name := "finatra-poc"

version := "1.0"

scalaVersion := "2.10.3"

resolvers ++= Seq(
  "twttr" at "http://maven.twttr.com",
  "spray nightlies repo" at "http://nightlies.spray.io"
)

libraryDependencies ++= Seq(
  "com.twitter" % "finatra_2.10" % "1.5.0",
  "net.debasishg" % "redisclient_2.10" % "2.10",
  "io.spray" % "spray-json_2.10" % "1.2.5",
  "org.scalatest" % "scalatest_2.10" % "1.9.2" % "test",
  "org.mockito" % "mockito-core" % "1.9.5" % "test"
)

