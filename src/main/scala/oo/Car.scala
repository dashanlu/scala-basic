package oo

/**
 * Created by mengwang on 30/11/2014.
 */
//car declares a superclass Vehicle, it means this trait can be mixed into Vehicle's subclass
trait Car extends Vehicle{
  override def printInfo(): Unit ={
    println("This is a car")
  }
}
