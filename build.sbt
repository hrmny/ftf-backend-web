name := """ftf-backend-web"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala, SbtWeb)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
    jdbc,
    cache,
    ws,
    "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
    "org.webjars" %% "webjars-play" % "2.4.0-1",
    "org.webjars" % "react" % "0.14.0",
    "org.webjars" % "refluxjs" % "0.2.5"
)

