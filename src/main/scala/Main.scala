import scala.scalanative.unsafe._

object Main {
  def main(args: Array[String]): Unit =
    def fnDef(str: CString): CInt = str.toInt
    val fnDefPtr1 = CFuncPtr1.fromScalaFunction(fnDef)
    println(fnDefPtr1)
}
