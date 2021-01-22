package tutorial1

import companion.Car
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import scala.collection.mutable

class Section1 extends AnyFlatSpec with Matchers {
  "val" should "be initialized once and isn't allowed to change" in {
    val one = 1L

    val seq = Seq(1,2,3,4,5)
    val list = List(1,2,3)
//    one = 2 => final int i =1
//    var mutable = 1l
//    mutable="gdgd"

    //    TODO it won't be complied
    //    val one= 2
    one shouldBe 1
  }

  "var" should "be initialized without value and assigned to different value afterwards" in {
    var num = 1
    num shouldBe 1

    num = 2
    num shouldBe 2
  }

  "type" should "be inferred by Scala SDK implicitly, type declaration is not necessary" in {
    val int = 1
    val long = 1L

    int.isInstanceOf[Int] should be(true)
    int.isInstanceOf[Long] should be(false)

    long.isInstanceOf[Int] should be(false)
    long.isInstanceOf[Long] should be(true)
  }

  "Car" should "be instantiated by calling case class with all mandatory fields" in {
    val car = Car("Ford", "CF01 4DW", 12)
    car.name shouldBe "Ford"
    car.age shouldBe 12
    car.plateNumber shouldBe "CF01 4DW"
  }

  "Car" should "be instantiated whereby companion object" in {
    val car = Car("Mercedes")
    car.name shouldBe "Mercedes"
    car.age shouldBe 0
    car.plateNumber shouldBe ""
  }

  "List and Map " should "be initialized whereby their predefined companion objects" in {
    val list = List(1, 2, 3, 4, 5, 6)
    var set1 = Set(1, 2, 2, 3, 3, 3)

    val set2 = mutable.Set(12,3,45,54)
    val map = Map(1 -> "One", 2 -> "two", 3 -> "three")

    list.size shouldBe 6
//    set.size shouldBe 3
    map.keySet.size shouldBe 3

  }
}
