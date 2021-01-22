package javaconverter

import scala.collection.JavaConverters._


object JavaConverter {
  def getJavaList(size: Int): java.util.List[Int] = {
    if (size <= 0) java.util.Collections.emptyList()
    else if (size == 1) List(0).asJava
    else Range(0, size).toList.asJava
  }
}
