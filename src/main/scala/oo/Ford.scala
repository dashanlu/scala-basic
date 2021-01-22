package oo

/**
 * Created by mengwang on 29/11/2014.
 */
//trait linearization to handle the diamond problem
class Ford1 extends USProduct with Car
class Ford2 extends Car with USProduct


object FordTest {
  def main(args: Array[String]): Unit = {
    val ford1 = new Ford1
    ford1.printInfo()

    val ford2 = new Ford2
    ford2.printInfo()
  }
}
