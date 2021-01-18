package tutorial1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Section3 extends AnyFlatSpec with Matchers {
  "partial function" should "provide engineers with more flexibilities" in {
    val partialFunc = (x: Int, y: Int) => x + y

    // function object
    val partialAppliedFunc = partialFunc(1, _: Int)

    partialAppliedFunc(0) shouldBe 1
    partialAppliedFunc(1) shouldBe 2
    partialAppliedFunc(3) shouldBe 4
  }

  "curried function" should "provide engineers with more flexibilities" in {
    val curriedFunction = (x: Int) => (y: Int) => x + y
    val curriedFunc1 = curriedFunction(1)
    val curriedFunc2 = curriedFunction(2)

    curriedFunc1(1) shouldBe 2
    curriedFunc2(1) shouldBe 3


//    val curriedFunction1 = (x: Int) => (implicit ) => x + y
  }

  "closure function" should "provide engineers with more flexibilities" in {

    val createAddMore = (more: Int) => {
      x: Int => x + more
        //
    }

    //functional programming style
    //urlGenerator.
//    val addOneFunc = createAddMore()
    val addTwoFunc = createAddMore(2)
//    addOneFunc(1) shouldBe 2
    addTwoFunc(1) shouldBe 3
  }
}
