package tutorial1

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Section2 extends AnyFlatSpec with Matchers {
  "Int wrapper" should "provide advanced feature without writing extra code" in {
//    0 max 5 shouldBe 5
//    0 min -100 shouldBe -100
//
//    val size = (0 to 6).size
//    size shouldBe 7
  }

  "String wrapper" should "provide advanced features without extra string manipulation code" in {
    val test = "abc"
    (test capitalize) shouldBe "Abc"
    val truncatedStr = test drop 3
    truncatedStr shouldBe ""
  }
}
