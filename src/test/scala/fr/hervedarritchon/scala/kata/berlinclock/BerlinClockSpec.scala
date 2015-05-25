package fr.hervedarritchon.scala.kata.berlinclock

import codes.reactive.scalatime._
import org.scalatest.{FeatureSpec, GivenWhenThen, Matchers}

/**
 * Created by Hervé Darritchon on 23/05/15.
 *
 */
class BerlinClockSpec extends FeatureSpec with GivenWhenThen with Matchers {

  info("As a clock user\nI want to be able to convert tim to Berlin Clock time and lamps illuminated.")

  feature("As a clock user I can accurately tell the time down to the minute") {
    scenario("It's twelve o'clock so no lamp from the bottom line is illuminated") {
      Given("I have started the converter")
      When("I enter Twelve o'clock")
      Then("No lamp is illuminated")
    }

    scenario("It's twelve past 2mn so the first two lamps from the bottom line are illuminated") {
      Given("I have started the converter")
      When("I enter Twelve o'clock")
      Then("No lamp is illuminated")
    }

    scenario("It's twelve past 5mn. So only the first lamp from the second line is illuminated") {
      Given("I have started the converter")
      When("I enter Twelve o'clock")
      Then("No lamp is illuminated")
    }

    scenario("It's twelve past 15mn. So the first 3 lamps from the second line are illuminated and the third is red") {
      Given("I have started the converter")
      When("I enter Twelve o'clock")
      Then("No lamp is illuminated")
    }

    scenario("It's twelve past 45mn. So the first 9 lamps from the second line are illuminated and the third, the sixth and the ninth are illuminated in red") {
      Given("I have started the converter")
      When("I enter Twelve o'clock")
      Then("No lamp is illuminated")
    }

  }
}
