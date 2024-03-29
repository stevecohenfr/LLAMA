// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.4")

val appDependencies = Seq(
  "be.objectify" %% "deadbolt-java" % "2.0-SNAPSHOT"
)