package net.lockney

import net.lockney.model.SimpleObject
import org.scalatest.{DiagrammedAssertions, FunSuite}

class SimpleSuite extends FunSuite {

  test("An empty Set should have size 0") {
    assert(Set.empty.size == 0)
  }

  test("A SimpleObject should allow construction with a string") {
    val simple = new SimpleObject("a string")
    assert(simple.getAString === "a string")
  }
}
