package tutorial2

import oo.variance.{Apple, Fruit, Pear}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Section5 extends AnyFlatSpec with Matchers {
  "Covariance" should "guarantee that B can do everything A does, if B <: A" in {
    val apple = Apple()
    val pear = Pear()
    val apple1 = Apple()

    val empty = List()
    val oneApple = List(apple1)
    val twoApples = apple :: oneApple
    val appleAndPear = pear :: twoApples


    def count(fruits: List[Fruit]): Int = {
      //recap tail recursion and match pattern
      def countHelper(left: List[Fruit], counter: Int): Int = {
        left match {
          case x :: xs => countHelper(xs, counter + 1)
          case Nil => counter
        }
      }

      countHelper(fruits, 0)
    }


    println(count(empty))
    println(count(oneApple))
    println(count(twoApples))
    println(count(appleAndPear))
  }

  "Contravariant" should "guarantee type safer coding" in {
    trait Vehicle[-T] {
      val engineType: String
    }

    trait Engine
    abstract class InternalCombustionEngine extends Engine
    class PetrolEngine extends InternalCombustionEngine
    class DieselEngine extends InternalCombustionEngine

    class AncientCar extends Vehicle[InternalCombustionEngine] {
      override val engineType: String = "it is an old engine"
    }
    class PetrolCar extends Vehicle[PetrolEngine] {
      override val engineType: String = "It is a petrol engine"
    }

    class DieselCar extends Vehicle[DieselEngine] {
      override val engineType: String = "It is a diesel engine"
    }

    object EngineChecker {
      def display(car: Vehicle[PetrolEngine]): Unit = {
        println(car.engineType)
      }
    }

//In contra variance, if PetrolEngine <: InternalcombustionEngine, PetrolCar :> InternalcombustionEngine
    EngineChecker.display(new PetrolCar)
    EngineChecker.display(new AncientCar)
    //
    //    EngineChecker.display(new DieselCar)
  }
}

