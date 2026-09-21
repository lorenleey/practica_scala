file:///C:/Users/Usuario/practica_scala/parte3/parte3-1-vscode/torneo-twenty-one/src/main/scala/Main.scala
empty definition using pc, found symbol in pc: 
semanticdb not found
empty definition using fallback
non-local guesses:
	 -manos.
	 -scala/Predef.manos.
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
  
  def mostrarManos(puntuacionesRonda: Array[Int]): Unit = {

    var i = 0

    while (i < pu@@ntuacionesRonda.length){
        println(s"${jugadores(i)} -> ${puntuacionesRonda(i)} -> ${estadoMano(puntuacionesRonda(i))}"
        )

        i += 1

    }
}



  }
```


#### Short summary: 

empty definition using pc, found symbol in pc: 