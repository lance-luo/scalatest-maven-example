package net.lockney

import net.lockney.model.SimpleObject
import org.scalatest.FlatSpec

class SimpleSpec extends FlatSpec {

  "SimpleObject" should "accept a String" in {
    val simple = new SimpleObject("a string")
    assert(simple.getAString === "a string")
  }

  it should "even accept really long Strings" in {
    val longString = "a string" * 10000
    val simple = new SimpleObject(longString)
    assert(simple.getAString === longString)
  }

  it should "fail" in {
    val simple = new SimpleObject("a string")
    assert(simple.getAString === "a string that isn't")
  }

}
