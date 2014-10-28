import sbt._

object Dependencies {

  object V {
    val awsJavaSDK        = "1.8.10"
    val pellucidAwsWrap   = "0.6.1"
    val playIteratees     = "2.3.2"
    val scalaTest         = "2.2.1"
  }

  object Compile {

    val awsJavaSDK        = "com.amazonaws"       %   "aws-java-sdk"        % V.awsJavaSDK
    val pellucidAwsWrap   = "com.pellucid"        %%  "aws-wrap"            % V.pellucidAwsWrap
    val playIteratees     = "com.typesafe.play"   %%  "play-iteratees"      % V.playIteratees
  }

  object Test {

    val scalaTest         = "org.scalatest"       %% "scalatest"            % V.scalaTest % "test"
  }
}