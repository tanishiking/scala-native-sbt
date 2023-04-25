```scala
sbt:scala-native-sbt> nativeLink
[info] compiling 1 Scala source to /Users/tanishiking/ghq/github.com/tanishiking/scala-native-sbt/target/scala-3.2.2/classes ...
[error] -- Error: /Users/tanishiking/ghq/github.com/tanishiking/scala-native-sbt/src/main/scala/Main.scala:6:47
[error] 6 |    val fnDefPtr1 = CFuncPtr1.fromScalaFunction(fnDef)
[error]   |                    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
[error]   |value of type (? => ?) => scala.scalanative.unsafe.CFuncPtr1[?, ?] does not take parameters
[error] one error found
[error] (Compile / compileIncremental) Compilation failed
[error] Total time: 0 s, completed Apr 25, 2023, 4:39:46 PM
```
