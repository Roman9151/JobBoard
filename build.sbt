ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.0"
libraryDependencies += "org.typelevel" %% "cats-effect" % "3.5.0"
libraryDependencies += "co.fs2" %% "fs2-core" % "3.7.0"
lazy val root = (project in file("."))

  .settings(
    name := "JobDevBoard"
  )
