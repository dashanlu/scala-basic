package tutorial2

import java.util

import functional.list.MatchPattern
import javaconverter.JavaConverter
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

/*
Section2 converts some basics conversion between Java and Scala
Java library could be leveraged by Scala by making less effort than adopting Scala code into Java
*/
class Section2 extends AnyFlatSpec with Matchers {
  "collection in Scala" should "be able to covert to corresponding Java collection" in {
    //there is a JUnit test in java
    val emptyList = JavaConverter.getJavaList(-1)
    val singleList = JavaConverter.getJavaList(0)
    val multipleList1 = JavaConverter.getJavaList(1)
    val multipleList2 = JavaConverter.getJavaList(2)
    val multipleList3 = JavaConverter.getJavaList(10)

    println(emptyList)
    println(singleList)
    println(multipleList1)
    println(multipleList2)
    println(multipleList3)
  }

  "Collection in Java" should "be able to be initialized and manipulated in Scala" in {
    val javaList = new util.ArrayList[Int]()
    javaList.add(1)

    val javaMap = new util.HashMap[Int, String]()
    javaMap.put(1, "xixi")

    javaList.size shouldBe 1
    javaList.get(0) shouldBe 1
    javaMap.size() shouldBe 1
    javaMap.get(1) shouldBe "xixi"
  }

  "Collection" should "be manipulated by infix in match pattern" in {
    MatchPattern.sum(List(1, 2, 3, 4)) shouldBe Some(10)
    MatchPattern.sum(List()) shouldBe None
    MatchPattern.sum(List(1, -1, 3, -3)) shouldBe Some(0)
    MatchPattern.sum(Nil) shouldBe None
    val empty = Nil

//    println(Nil.head)
    println(List().head)

  }
}
