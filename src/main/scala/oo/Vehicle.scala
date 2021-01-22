package oo

/**
 * Created by mengwang on 29/11/2014.
 */
trait Vehicle extends Exportable {
  override def printInfo(): Unit = {
    println("this is a vehicle")
  }
}
