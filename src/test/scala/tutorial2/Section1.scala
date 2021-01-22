package tutorial2

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Section1 extends AnyFlatSpec with Matchers {
  "List" should "be able to be instantiated in different ways" in {
    val list0 = List(1, 2, 3, 4, 5)
    val list1 = 1 :: 2 :: 3 :: 4 :: 5 :: Nil
//    val list2 = 6::list1

    list0 shouldBe list1
  }

  "Empty list" should "be able to be instantiated in different ways" in {
    val emptyList0 = List()
    val emptyList1 = Nil
    val list = 1::Nil
    val list2 = 2::emptyList1


    emptyList0 shouldBe emptyList1
  }

  "Two lists" should "be concatenated by ::: " in {
    val list1 = List(1)
    val list2 = List(2)
    list1 ::: list2 shouldBe List(1, 2)

    list1 ::: list2 foreach println
  }
}

