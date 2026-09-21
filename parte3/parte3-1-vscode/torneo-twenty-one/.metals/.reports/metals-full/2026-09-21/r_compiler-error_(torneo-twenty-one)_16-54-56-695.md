error id: 82A0FBE7484265536A061956FDC5CE9E
file:///C:/Users/Usuario/practica_scala/parte3/parte3-1-vscode/torneo-twenty-one/src/main/scala/Main.scala
### scala.reflect.internal.FatalError: 
  ThisType(method mostrarManos) for sym which is not a class
     while compiling: file:///C:/Users/Usuario/practica_scala/parte3/parte3-1-vscode/torneo-twenty-one/src/main/scala/Main.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.12.21
    compiler version: version 2.12.21
  reconstructed args: -classpath <WORKSPACE>\.bloop\torneo-twenty-one\bloop-bsp-clients-classes\classes-Metals-Kp__ojlBQv2b3E6lvFMCGw==;<HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.12.3\semanticdb-javac-0.12.3.jar;<HOME>\.sbt\boot\scala-2.12.21\lib\scala-library.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Ident(i)
       tree position: line 53 of file:///C:/Users/Usuario/practica_scala/parte3/parte3-1-vscode/torneo-twenty-one/src/main/scala/Main.scala
            tree tpe: Int
              symbol: variable i
   symbol definition: var i: Int (a TermSymbol)
      symbol package: <empty>
       symbol owners: variable i -> method mostrarManos -> object Main
           call site: <none> in <none>

== Source file context for tree position ==

    50     var i = 0
    51 
    52     while (i < manos.length){
    53         println(s"${jugadores(i)} -> ${_CURSOR_puntuacionesRonda(i)} -> ${estadoMano(puntuacionesRonda(i))}"
    54         )
    55 
    56         i += 1

occurred in the presentation compiler.



action parameters:
offset: 817
uri: file:///C:/Users/Usuario/practica_scala/parte3/parte3-1-vscode/torneo-twenty-one/src/main/scala/Main.scala
text:
```scala
object Main extends App {

    //Datos
val jugadores = List(
  "Alex",
  "Chen",
  "Marta",
  "Sindhu",
  "Luis"
)

val puntuaciones = Array(
  18,
  24,
  21,
  20,
  26
)


def bust (puntuacion: Int):Boolean = {
    puntuacion> 21
}

def estadoMano(puntuacion: Int):String={
    if (bust(puntuacion)){
        "BUST"
    } else {
        "VALIDA"
    }
}

  def mejorMano(handA: Int, handB: Int): Int = {

    if (bust(handA) && bust(handB)) {
      0
    } else if (bust(handA)) {
      handB
    } else if (bust(handB)) {
      handA
    } else if (handA > handB) {
      handA
    } else {
      handB
    }
  }
  
  def mostrarManos(puntuacionesRonda: Array[Int]): Unit = {

    var i = 0

    while (i < manos.length){
        println(s"${jugadores(i)} -> ${@@puntuacionesRonda(i)} -> ${estadoMano(puntuacionesRonda(i))}"
        )

        i += 1

    }
}



  }
```


presentation compiler configuration:
Scala version: 2.12.21
Classpath:
<WORKSPACE>\.bloop\torneo-twenty-one\bloop-bsp-clients-classes\classes-Metals-Kp__ojlBQv2b3E6lvFMCGw== [exists ], <HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.12.3\semanticdb-javac-0.12.3.jar [exists ], <HOME>\.sbt\boot\scala-2.12.21\lib\scala-library.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb




#### Error stacktrace:

```
scala.reflect.internal.Reporting.abort(Reporting.scala:69)
	scala.reflect.internal.Reporting.abort$(Reporting.scala:65)
	scala.reflect.internal.SymbolTable.abort(SymbolTable.scala:28)
	scala.reflect.internal.Types$ThisType.<init>(Types.scala:1193)
	scala.reflect.internal.Types$UniqueThisType.<init>(Types.scala:1213)
	scala.reflect.internal.Types$ThisType$.apply(Types.scala:1217)
	scala.meta.internal.pc.AutoImportsProvider$$anonfun$1.applyOrElse(AutoImportsProvider.scala:108)
	scala.meta.internal.pc.AutoImportsProvider$$anonfun$1.applyOrElse(AutoImportsProvider.scala:90)
	scala.collection.immutable.List.collect(List.scala:315)
	scala.meta.internal.pc.AutoImportsProvider.autoImports(AutoImportsProvider.scala:90)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$autoImports$1(ScalaPresentationCompiler.scala:399)
	scala.meta.internal.pc.CompilerAccess.retryWithCleanCompiler(CompilerAccess.scala:182)
	scala.meta.internal.pc.CompilerAccess.$anonfun$withSharedCompiler$1(CompilerAccess.scala:155)
	scala.Option.map(Option.scala:230)
	scala.meta.internal.pc.CompilerAccess.withSharedCompiler(CompilerAccess.scala:154)
	scala.meta.internal.pc.CompilerAccess.$anonfun$withInterruptableCompiler$1(CompilerAccess.scala:92)
	scala.meta.internal.pc.CompilerAccess.$anonfun$onCompilerJobQueue$1(CompilerAccess.scala:209)
	scala.meta.internal.pc.CompilerJobQueue$Job.run(CompilerJobQueue.scala:152)
	java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	java.base/java.lang.Thread.run(Thread.java:840)
```
#### Short summary: 

scala.reflect.internal.FatalError: 
  ThisType(method mostrarManos) for sym which is not a class
     while compiling: file:///C:/Users/Usuario/practica_scala/parte3/parte3-1-vscode/torneo-twenty-one/src/main/scala/Main.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.12.21
    compiler version: version 2.12.21
  reconstructed args: -classpath <WORKSPACE>\.bloop\torneo-twenty-one\bloop-bsp-clients-classes\classes-Metals-Kp__ojlBQv2b3E6lvFMCGw==;<HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.12.3\semanticdb-javac-0.12.3.jar;<HOME>\.sbt\boot\scala-2.12.21\lib\scala-library.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: Ident(i)
       tree position: line 53 of file:///C:/Users/Usuario/practica_scala/parte3/parte3-1-vscode/torneo-twenty-one/src/main/scala/Main.scala
            tree tpe: Int
              symbol: variable i
   symbol definition: var i: Int (a TermSymbol)
      symbol package: <empty>
       symbol owners: variable i -> method mostrarManos -> object Main
           call site: <none> in <none>

== Source file context for tree position ==

    50     var i = 0
    51 
    52     while (i < manos.length){
    53         println(s"${jugadores(i)} -> ${_CURSOR_puntuacionesRonda(i)} -> ${estadoMano(puntuacionesRonda(i))}"
    54         )
    55 
    56         i += 1