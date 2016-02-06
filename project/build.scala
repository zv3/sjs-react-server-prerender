import sbt._
import Keys._

import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

object Build extends Build {

  val uPickleVersion  = "0.3.8"

  val root = Project(
    id = "sjs-react-server-prerender",
    base = file("."),
    settings = Seq(
      name := "sjs-react-server-prerender",
      version := "0.0.1-SNAPSHOT",
      scalaVersion := "2.11.7",

      scalaJSOutputWrapper := ("var __ScalaJSEnv = { exportsNamespace: exports, global: global };", ""),

      persistLauncher := true,
      persistLauncher in Test := false,

      unmanagedSourceDirectories in Compile := Seq((scalaSource in Compile).value),

      libraryDependencies ++= Seq(
        "com.github.japgolly.scalajs-react"              %%% "core"              % "0.10.4" withSources(),
        "com.lihaoyi"                                     %% "upickle"           % uPickleVersion,
        "com.lihaoyi"                                    %%% "upickle"           % uPickleVersion,
        "com.lihaoyi"                                    %%% "autowire"          % "0.2.5"
      )
    )
  ).enablePlugins(ScalaJSPlugin)
}