package tutorial1

import nestedmethod.FibonacciNum
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Section4 extends AnyFlatSpec with Matchers {
  "function" should "be treated as an instance of class" in {
    //type inference
    val doubleFunc: Int => Int = x => 2 * x
    val doubleFunc1 = (x: Long) => 2 * x

    doubleFunc(1) shouldBe 2
    doubleFunc1(1) shouldBe 2L
  }

  "method" should "have a nested method within the method body" in {
    val fibonacciNum = new FibonacciNum
    fibonacciNum.calculate(0) shouldBe List(0)
    fibonacciNum.calculate(1) shouldBe List(0)
    fibonacciNum.calculate(2) shouldBe List(0, 1)
    fibonacciNum.calculate(3) shouldBe List(0, 1, 1)
    fibonacciNum.calculate(4) shouldBe List(0, 1, 1, 2)
    fibonacciNum.calculate(5) shouldBe List(0, 1, 1, 2, 3)
  }

  "flatMap comprehension" should "handle monand structure in a concise way" in {
//    val fibonacciNum = new FibonacciNum
//    println(fibonacciNum.monand(Some(0), None))
//    println(fibonacciNum.monand(None, None))
//    println(fibonacciNum.monand(None, Some(2)))
//    println(fibonacciNum.monand(Some(1), Some(2)))

    val func = (a:Int) => List(a, a+1, a+2)
    val result = List(1,2,4) flatMap func
    println(result)
  }
}

