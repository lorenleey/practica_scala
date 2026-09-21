error id: file:///C:/Users/Usuario/practica_scala/parte3/parte3-1-vscode/torneo-twenty-one/src/main/scala/Main.scala:_empty_/Main.mostrarManos().(puntuacionesRonda)
file:///C:/Users/Usuario/practica_scala/parte3/parte3-1-vscode/torneo-twenty-one/src/main/scala/Main.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -puntuaciones.
	 -scala/Predef.puntuaciones.
offset: 764
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
  
  def mostrarManos(puntuaciones: Array[Int]): Unit = {

    var i = 0

    while (i < puntuac@@iones.length){
        println(s"${jugadores(i)} -> ${puntuacionesRonda(i)} -> ${estadoMano(puntuacionesRonda(i))}"
        )

        i += 1

    }
}

 def contarValidas(puntuacionesRonda: Array[Int]): Int = {

    var validas = 0
    var i = 0

    while (i < puntuacionesRonda.length) {

      if (!bust(puntuacionesRonda(i))) {
        validas += 1
      }

      i += 1
    }

    validas
  }

   def contarBust(puntuacionesRonda: Array[Int]): Int = {

    var cantidadBust = 0
    var i = 0

    while (i < puntuacionesRonda.length) {

      if (bust(puntuacionesRonda(i))) {
        cantidadBust += 1
      }

      i += 1
    }

    cantidadBust
  }

  def mejorPuntuacion(puntuacionesRonda: Array[Int]): Int = {

    var mejor = 0
    var i = 0

    while (i < puntuacionesRonda.length) {

      mejor = mejorMano(mejor, puntuacionesRonda(i))

      i += 1
    }

    mejor
  }

mostrarManos(puntuaciones)

def mostrarResumen(puntuacionesRonda:Array[Int]):Unit = {
  println()
  println("--- Resumen de la ronda ---")
  println()
  println(s" Jugadores: ${jugadores.length}")
  println(s"Manos válidas: ")


}

  }
```


#### Short summary: 

empty definition using pc, found symbol in pc: 