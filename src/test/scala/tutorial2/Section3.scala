package tutorial2.tutorial1

import java.util.Calendar

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Section3 extends AnyFlatSpec with Matchers {
  "foldLeft" should "be able to do aggregation work" in {
    val sum = List(1, 2, 3, 4).sum
    sum shouldBe 10

    val sum1 = List(1, 2, 3, 4).foldLeft(0)(_ + _)
    sum1 shouldBe 10

    val strings = List("one", "two", "three")
    val maxLength = strings.foldLeft(0)((curMax: Int, nextStr: String) => {
      if (curMax >= nextStr.length) curMax else nextStr.length
    })
    maxLength shouldBe 5
  }

  "foldLeft" should "be able to do something even more" in {
    //    new functions could be invented by chaining up a list of individual functions
    val capitalizeFunc = (str: String) => str capitalize
    val addTitleFunc = (str: String) => s"Mr $str"
    val greetingFunc = (str: String) => {
      val timeOfDay = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
      if (timeOfDay >= 0 && timeOfDay < 12) s"Good morning $str"
      else if (timeOfDay >= 12 && timeOfDay < 16) s"Good afternoon $str"
      else if (timeOfDay >= 16 && timeOfDay < 21) s"Good evening $str"
      else s"Good night $str"
    }

    val compositeFunc = (functions: Seq[String => String]) => (initials: String) => {
      functions.foldLeft(initials) { (cur, function) => function(cur) }
    }

    val greetingMsgFunc = compositeFunc(List(capitalizeFunc, addTitleFunc, greetingFunc))

    val nameList = List("Tom", "John", "Natalie", "Shawn", "Laura")
    nameList map greetingMsgFunc foreach println
  }

}
