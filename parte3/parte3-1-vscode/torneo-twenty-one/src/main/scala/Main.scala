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

def estadoMano(puntuacion: Int):String{
    if (bust(puntuacion)){
        "BUST"
    } else {
        "VALIDA"
    }
}
}