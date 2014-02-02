name := "protoCore"

version := "1.0-SNAPSHOT"

//val customLib = Seq()


libraryDependencies ++= Seq(jdbc, anorm, cache)

// Add play plugin settings
play.Project.playScalaSettings


