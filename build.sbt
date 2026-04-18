val ScalatraVersion = "3.1.2"

organization := "fr.brouillard.gitbucket"
name := "gitbucket-h2-backup-plugin"
version := "1.9.1"
scalaVersion := "2.13.18"
gitbucketVersion := "4.46.1"
scalacOptions += "-deprecation"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest-funspec"  % "3.2.20" % "test",
  "org.scalatest" %% "scalatest-funsuite" % "3.2.20" % "test",
  "org.scalatra"  %% "scalatra-scalatest-javax" % ScalatraVersion % "test",
  "org.mockito"   %  "mockito-core"       % "5.23.0" % "test",
)
