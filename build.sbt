// scalaVersion := "3.2.2"
scalaVersion := "2.13.10"

enablePlugins(ScalaNativePlugin)

// set to Debug for compilation details (Info is default)
logLevel := Level.Info

// import to add Scala Native options
import scala.scalanative.build._

// defaults set with common options shown
nativeConfig ~= { c =>
  c.withLTO(LTO.none) // thin
    .withMode(Mode.debug) // releaseFast
    .withGC(GC.none) // commix
    .withDump(true)
    .withDebugMetadata(true)
    .withCompileOptions(c.compileOptions :+ "-g")
    .withLinkingOptions(c.linkingOptions :+ "-g")
}
