package src.main.scala

object Main extends App {
  val estudiantes = List(
    "Ana",
    "Luis",
    "Marta",
    "Pedro",
    "Sofia"
  )

  val notas = Array(
    8,
    4,
    10,
    6,
    3
  )


  // FUNCIONES
  def aprobado(nota: Int): Boolean={
    nota>= 5

  }

  def estadoNota(nota: Int):String= {
    if (aprobado(nota)){
      "APROBADO"
    } else {
      "SUSPENSO"
    }
  }

  def maxNota(a: Int, b: Int): Int = {

    if (a > b) {
      a
    } else {
      b
    }
  }

  def mostrarNotas(notasEvaluacion: Array[Int]): Unit = {

    var i = 0

    while (i < notasEvaluacion.length) {

      println(
        s"${estudiantes(i)} -> ${notasEvaluacion(i)} -> ${estadoNota(notasEvaluacion(i))}"
      )

      i += 1
    }
  }

  println("PRIMERA EVALUACIÓN")
  mostrarNotas(notas)

  def contarAprobados(notasEvaluacion: Array[Int]): Int = {

    var aprobados = 0
    var i = 0

    while (i < notasEvaluacion.length) {

      if (aprobado(notasEvaluacion(i))) {
        aprobados += 1
      }

      i += 1
    }

    aprobados
  }


  def mejorNota(notasEvaluacion: Array[Int]): Int = {

    var mejor = 0
    var i = 0

    while (i < notasEvaluacion.length) {

      mejor = maxNota(mejor, notasEvaluacion(i))

      i += 1
    }

    mejor
  }


  def mostrarResumen(notasEvaluacion: Array[Int]): Unit = {

    val numeroAprobados = contarAprobados(notasEvaluacion)
    val numeroSuspensos = notasEvaluacion.length - numeroAprobados

    println()
    println("--- Resumen del grupo ---")
    println()

    println(s"Estudiantes: ${estudiantes.length}")
    println(s"Aprobados: $numeroAprobados")
    println(s"Suspensos: $numeroSuspensos")
    println(s"Mejor nota: ${mejorNota(notasEvaluacion)}")
  }

  def mostrarClasificaciones(notasEvaluacion: Array[Int]): Unit = {

    var i = 0

    while (i < notasEvaluacion.length) {

      println(
        s"${estudiantes(i)} -> ${notasEvaluacion(i)} -> ${clasificacion(notasEvaluacion(i))}"
      )

      i += 1
    }
  }

  mostrarResumen(notas)
  println()
  println("--- Clasificación ---")
  println()

  mostrarClasificaciones(notas)

  val aprobadosEvaluacion1 = contarAprobados(notas)
  val mejorEvaluacion1 = mejorNota(notas)

  val notasSegundaEvaluacion = Array(
    9,
    5,
    8,
    7,
    6
  )

  println()
  println("SEGUNDA EVALUACIÓN")
  println()

  mostrarNotas(notasSegundaEvaluacion)

  mostrarResumen(notasSegundaEvaluacion)

  println()
  println("--- Clasificación ---")
  println()

  mostrarClasificaciones(notasSegundaEvaluacion)

  val aprobadosEvaluacion2 = contarAprobados(notasSegundaEvaluacion)
  val mejorEvaluacion2 = mejorNota(notasSegundaEvaluacion)

  println()
  // Comparativa entre evaluación 1 y 2

  println("COMPARATIVA")
  println()

  println(s"Mejor nota primera evaluacion: $mejorEvaluacion1")
  println(s"Mejor nota segunda evaluacion: $mejorEvaluacion2")

  println(s"Aprobados primera evaluacion: $aprobadosEvaluacion1")
  println(s"Aprobados segunda evaluacion: $aprobadosEvaluacion2")

  if (aprobadosEvaluacion2 > aprobadosEvaluacion1) {
    println("El grupo ha mejorado")
  } else if (aprobadosEvaluacion2 < aprobadosEvaluacion1) {
    println("El grupo ha empeorado")
  } else {
    println("El grupo se ha mantenido igual")
  }

  println("LISTAS")
  println()

  val nuevosEstudiantes = "Maritza" :: estudiantes

  println(s"Lista original: $estudiantes")
  println(s"Lista nueva: $nuevosEstudiantes")
}