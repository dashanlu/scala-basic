package oo.variance

sealed trait Fruit {
  override def toString: String = "I am a fruit"
}

case class Apple() extends Fruit {
  override def toString: String = "I am an apple"
}

case class Pear() extends Fruit {
  override def toString: String = "i am a pear"
}


class Basket[+A](item: A*) {
  val getItem: Seq[A] = item

  override def toString: String = item match {
    case apple: Seq[Apple] => s"there is an apple in the basket, it says ${apple.toString}"
    case pear: Seq[Pear] => s"there is a pear in the basket, it says ${pear.toString}"
    case Nil => "it is an empty basket"
  }
}