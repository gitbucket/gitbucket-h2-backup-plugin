val ScalatraVersion = "3.1.2"

organization := "fr.brouillard.gitbucket"
name := "gitbucket-h2-backup-plugin"
version := "1.9.1"
scalaVersion := "2.13.18"
gitbucketVersion := "4.45.0"
scalacOptions += "-deprecation"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest-funspec"  % "3.2.19" % "test",
  "org.scalatest" %% "scalatest-funsuite" % "3.2.19" % "test",
  "org.scalatra"  %% "scalatra-scalatest-javax" % ScalatraVersion % "test",
  "org.mockito"   %  "mockito-core"       % "3.12.4" % "test",
)
