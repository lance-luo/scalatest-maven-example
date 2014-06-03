package net.lockney

import org.scalatest.FlatSpec

class TestMeSpec extends FlatSpec {
  "An empty Set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }

  "TestMe" should "accept a String" in {
    val testMe = new TestMe("a string")
    assert(testMe.getAString === "a string")
  }
}
