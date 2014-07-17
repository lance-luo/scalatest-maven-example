package net.lockney

import net.lockney.dao.SimpleDAO
import org.scalatest.{FeatureSpec, GivenWhenThen}

class AcceptanceTest extends FeatureSpec with GivenWhenThen {

  info("As a user")
  info("I want to be able to create a simple thing and implicitly start it")
  info("So that I can then turn it off")
  info("And see that it is stopped")

  feature("Simple thing state") {
    scenario("User stops thing when it's already on") {

      Given("An initialized thing, that has not been started")
      val simpleThing = new SimpleDAO(false)

      When("User stops it again")
      intercept[UnsupportedOperationException] {
        simpleThing.stop()
      }

      Then("We should see that it is stopped")
      assert(simpleThing.started() == false)
    }
  }
}
