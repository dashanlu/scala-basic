package oo

/**
 * Created by mengwang on 29/11/2014.
 */
//USProduct declares a superclass Vehicle, it means this trait can be mixed into Vehicle's subclass
trait USProduct extends Vehicle{
  override def printInfo(): Unit ={
    println("This is a US product")
  }
}
