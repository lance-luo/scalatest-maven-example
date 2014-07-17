package net.lockney

import org.scalatest.{Matchers, FunSuite}

class MatcherExampleSuite extends FunSuite with Matchers {

  test("equality") {
    val i = 3

    i should equal (3)
//    i should === 3
    i should be (3)
    i shouldEqual(3)
    i shouldBe 3

    Array(1, 3) should equal(Array(1, 3))
  }

  test("string matchers") {
    val aString = "something"

    aString should startWith("some")
    aString should endWith("some")
    aString should include("eth")
  }



}
