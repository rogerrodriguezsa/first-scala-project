package net.bluetab.testingscala.main

object Main extends App {
    println("Hello world!")

  def getSomething(): Unit = {
    //manejo de errores. para que el programa no se caiga (exception)
    // val init =
    try {
      //codigo que puede fallar

      //conexion hacia el ADLS
      //conexion hacia cosmodb, sql database
    } cath {
      case e: NullPointerException => doSomethingNullPointerException
      case e: NumberFormatException => println("accion de nmber")
      case e: Exception => println("excepcion generica")
    } finally {
      // cerrar mi conexion hacia sql database
      // val finish =
      // val duracion = finish - init

    }
  }

  def doSomethingNullPointerException(): Unit = {

  }
}

