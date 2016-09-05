// sbt-scalapb must be before sbt-scalajs
// https://github.com/trueaccord/ScalaPB/issues/150#issuecomment-236232402
addSbtPlugin("com.trueaccord.scalapb" % "sbt-scalapb" % "0.5.38")

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.6.0")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.11")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.1.4")

addSbtPlugin("com.heroku" % "sbt-heroku" % "1.0.1")

