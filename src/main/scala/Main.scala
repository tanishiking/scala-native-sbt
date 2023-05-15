package main

object Main {
  def main(args: Array[String]): Unit = {
    def internal(x: Int) = x
    println(internal(Foo(1).baz))
  }
}

case class Foo(bar: Int) {
  def baz = bar
}

/*
    // type StructA = CStruct2[CInt, CString]

    // val fn2: CFuncPtr2[CString, StructA, StructA] =
    //   CFuncPtr2.fromScalaFunction { (arg1: CString, arg2: StructA) =>
    //     arg2._2 = arg1
    //     arg2._1 = 42
    //     arg2
    //   }

    // Zone {
    //   implicit z =>
    //     val str = alloc[StructA]()
    //     val charset = java.nio.charset.StandardCharsets.UTF_8

    //     str._1 = 1
    //     str._2 = toCString("hello_world", charset)

    //     val sarg = toCString("fourty_two", charset)
    //     // val expected = fromCString(sarg, charset)
    //     val res = fn2(sarg, str)
    //     val strResult = fromCString(res._2, charset)
    //     println(res._1)
    //     println(strResult)
    //     // assertEquals(res._1, 42)
    //     // assertEquals(strResult, expected)
    // }


    // def fnDef(str: CString): CInt = str.toInt
    // val fnDefPtr1 = CFuncPtr1.fromScalaFunction(fnDef)
    // val anyPtr = CFuncPtr.toPtr(fnDefPtr1)
    // val func = CFuncPtr.fromPtr[CFuncPtr1[CString, CInt]](anyPtr)
    // println(func(c"12"))
  }
}


Apply(
  Ident(_fromScalaFunction),
  List(
    Block(
      List(),
      Block(
        List(),
        Closure(
          List(),
          Select(This(Ident(Main$)),$anonfun$1),
          EmptyTree
        )
      )
    ),
    Literal(Constant(TypeRef(ThisType(TypeRef(NoPrefix,module class unsafe)),class Ptr))),
    Literal(Constant(TypeRef(ThisType(TypeRef(NoPrefix,module class unsafe)),class CStruct2))),
    Literal(Constant(TypeRef(ThisType(TypeRef(NoPrefix,module class unsafe)),class CStruct2)))
  )
)
*/
