name := "finatra-poc"

version := "1.2"

scalaVersion := "2.10.3"

resolvers ++= Seq(
  "twttr" at "http://maven.twttr.com",
  "spray nightlies repo" at "http://nightlies.spray.io",
  "anormcypher" at "http://repo.anormcypher.org/",
  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/",
  "Neo4j releases" at "http://m2.neo4j.org/content/repositories/releases/"
)

libraryDependencies ++= Seq(
  "com.twitter" %% "finatra" % "1.5.0",
  "net.debasishg" %% "redisclient" % "2.10",
  "io.spray" %% "spray-json" % "1.2.5",
  "org.scalatest" %% "scalatest" % "1.9.2" % "test",
  "org.mockito" % "mockito-core" % "1.9.5" % "test",
  "org.anormcypher" %% "anormcypher" % "0.4.4",
  "eu.fakod" %% "neo4j-scala" % "0.3.0"
)

