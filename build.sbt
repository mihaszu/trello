import play.Project._

name := "zentask"

version := "1.0"

libraryDependencies ++= Seq(javaJdbc, javaEbean)    
ebeanEnabled := true 

playJavaSettings
