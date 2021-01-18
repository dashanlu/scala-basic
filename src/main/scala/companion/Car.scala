package companion

case class Car(name: String, plateNumber: String, age: Int)

object Car {
  def apply(name: String): Car = {
    Car(name, "", 0)
  }
}