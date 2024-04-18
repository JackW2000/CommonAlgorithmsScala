ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.3"

lazy val root = (project in file("."))
  .settings(
    name := "CommonAlgorithmsScala",
    idePackagePrefix := Some("com.jackw")
  )

libraryDependencies += "net.aichler" % "jupiter-interface" % "0.11.1" % "test->default"