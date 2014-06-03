package net.lockney

import org.scalatest.FunSuite

class TestMeSuite extends FunSuite {

  test("An empty Set should have size 0") {
    assert(Set.empty.size == 0)
  }

  test("A TestMe should allow creating with a string") {
    val testMe = new TestMe("a string")
    assert(testMe.getAString === "a string")
  }
}
