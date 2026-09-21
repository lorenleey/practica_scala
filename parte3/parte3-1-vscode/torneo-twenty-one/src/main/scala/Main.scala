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
  
  def mostrarManos(puntuacionesR: Array[Int]): Unit = {

    var i = 0

    while (i < puntuacionesR.length){
        println(s"${jugadores(i)} -> ${puntuacionesR(i)} -> ${estadoMano(puntuacionesR(i))}"
        )

        i += 1

    }
}

 def contarValidas(puntuacionesR: Array[Int]): Int = {

    var validas = 0
    var i = 0

    while (i < puntuacionesR.length) {

      if (!bust(puntuacionesR(i))) {
        validas += 1
      }

      i += 1
    }

    validas
  }

   def contarBust(puntuacionesR: Array[Int]): Int = {

    var cantidadBust = 0
    var i = 0

    while (i < puntuacionesR.length) {

      if (bust(puntuacionesR(i))) {
        cantidadBust += 1
      }

      i += 1
    }

    cantidadBust
  }

  def mejorPuntuacion(puntuacionesR: Array[Int]): Int = {

    var mejor = 0
    var i = 0

    while (i < puntuacionesR.length) {

      mejor = mejorMano(mejor, puntuacionesR(i))

      i += 1
    }

    mejor
  }
  println(" RONDA 1 ")
mostrarManos(puntuaciones)

  // RONDA 1

def mostrarResumen(puntuacionesR:Array[Int]):Unit = {
  println()
  println("--- Resumen de la ronda ---")
  println()
  println(s" Jugadores: ${jugadores.length}")
  println(s"Manos válidas: ${contarValidas(puntuaciones)}")
  println(s"Bust: ${contarBust(puntuaciones)}")
  println(s"Mejor puntuación válida: ${mejorPuntuacion(puntuaciones)}")



}
  mostrarResumen(puntuaciones)
  val mejorRonda1 = mejorPuntuacion(puntuaciones)

  // RONDA 2

val puntuacionesRonda2 = Array(
  22,
  19,
  20,
  21,
  17
)
  println()
  println(" RONDA 2 ")

  mostrarManos(puntuacionesRonda2)
  mostrarResumen(puntuacionesRonda2)
  val mejorRonda2 = mejorPuntuacion(puntuacionesRonda2)

  // Comparación de las dos rondas
  println()
  println(" COMPARACIÓN")
  println(s"Mejor puntuación de la primera ronda: ${mejorRonda1}")
  println(s"Mejor puntuación de la segunda ronda: ${mejorRonda2}")

if (mejorRonda1 > mejorRonda2){
  println("La ronda 1 tuvo la mejor puntuación")
} else if (mejorRonda2 > mejorRonda1){
  println("La ronda 2 tuvo la mejor puntuación ")
} else {
  println("Las dos rondas tuvieron la misma mejor puntuación")
}


// Repetición con foreach

println()
  println(" RECORRIDO CON FOREACH:")
  println()

  puntuaciones.foreach(puntuacion => {
    println(s"$puntuacion -> ${estadoMano(puntuacion)}")
  })
  }