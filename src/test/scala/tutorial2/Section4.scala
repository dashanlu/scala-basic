package tutorial2

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Section4 extends AnyFlatSpec with Matchers {
  "implicit function" should "be picked up and converts the string to double before applying square root function" in {
    import implicitTest.ImplicitConversion._

    println(Math.sqrt("2000"))
  }
}

