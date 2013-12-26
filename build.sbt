name := "finatra-poc"

version := "1.0"

resolvers += "twttr" at "http://maven.twttr.com"

libraryDependencies += "com.twitter" % "finatra" % "1.1.0"

libraryDependencies += "org.specs2" %% "specs2" % "2.3.7" % "test"

scalacOptions in Test ++= Seq("-Yrangepos")

