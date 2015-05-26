package fr.hervedarritchon.scala.kata.berlinclock

import org.scalatest.{FeatureSpec, GivenWhenThen, Matchers}

/**
 * Created by Hervé Darritchon on 23/05/15.
 *
 */
class BerlinClockSpec extends FeatureSpec with GivenWhenThen with Matchers {

  info("As a clock user. I want to be able to convert time to Berlin Clock time and lamps illuminated.")

  feature("As a clock user I can accurately tell the time down to the minute") {
    scenario("It's twelve o'clock so no lamp from the bottom line is illuminated") {
      Given("I have started the converter")
      When("I enter Twelve o'clock")
      Then("First row : No lamp is illuminated")
    }

    scenario("It's twelve past 2mn so the first two lamps from the bottom line are illuminated") {
      Given("I have started the converter")
      When("I enter Twelve o'clock past two")
      Then("First row : The first two lamps are illuminated")
    }

    scenario("It's twelve past 4mn so all the lamps from the bottom line are illuminated") {
      Given("I have started the converter")
      When("I enter Twelve o'clock past four")
      Then("First row : All the lamps are illuminated")
    }

    scenario("It's twelve past 5mn so no lamp is illuminated") {
      Given("I have started the converter")
      When("I enter Twelve o'clock past five")
      Then("First row : No lamp is illuminated")
    }
  }

  feature("As a clock user I want to be able to see five minutes. So that I can tell higher minute amounts more easily at a glance") {
    scenario("It's twelve past 5mn. So only the first lamp from the second line is illuminated") {
      Given("I have started the converter")
      When("I enter Twelve o'clock past five")
      Then("Second row : the first lamp is illuminated")
    }

    scenario("It's twelve past 15mn. So the first 3 lamps from the second line are illuminated and the third is red") {
      Given("I have started the converter")
      When("I enter Twelve o'clock past fifteen")
      Then("Second row : the first 3 lamps from the second line are illuminated and the third is red")
    }

    scenario("It's twelve past 45mn. So the first 9 lamps from the second line are illuminated and the third, the sixth and the ninth are illuminated in red") {
      Given("I have started the converter")
      When("I enter Twelve o'clock past forty five")
      Then("Second row : the first 9 lamps from the second line are illuminated and the third, the sixth and the ninth are illuminated in red")
    }

    scenario("It's 12:59. So all the lamps are illuminated and the third, the sixth and the ninth are illuminated in red") {
      Given("I have started the converter")
      When("I enter 12:59")
      Then("Second row : All the lamps are illuminated and the third, the sixth and the ninth are illuminated in red")
    }

  }

  feature("As a clock user. I want to be able to see single hours. So that I can tell what hour it is") {
    scenario("It's midnight so no lamp from the third line is illuminated") {
      Given("I have started the converter")
      When("I enter 12 o'clock")
      Then("Third row : No lamp is illuminated")
    }

    scenario("It's 2 o'clock so the first two lamps from the third line are illuminated") {
      Given("I have started the converter")
      When("I enter 2 o'clock")
      Then("Third row : The first two lamps are illuminated")
    }

    scenario("It's 4 o'clock so all the lamps from the third line are illuminated") {
      Given("I have started the converter")
      When("I enter 4 o'clock")
      Then("Third row : All the lamps are illuminated")
    }

    scenario("It's 5 o'clock so no lamp is illuminated") {
      Given("I have started the converter")
      When("I enter 5 o'clock")
      Then("Third row : No lamp is illuminated")
    }
  }

  feature("As a clock user. I want to be able to see five hours. So that I can tell higher hour amounts more easily at a glance") {
    scenario("It's midnight so no lamp from the fourth line is illuminated") {
      Given("I have started the converter")
      When("I enter midnight")
      Then("Fourth row : No lamp is illuminated")
    }

    scenario("It's 13 o'clock so the first two lamps from the fourth line are illuminated") {
      Given("I have started the converter")
      When("I enter 13 o'clock")
      Then("Fourth row : The first two lamps are illuminated in red")
    }

    scenario("It's 23 o'clock so all the lamps are illuminated") {
      Given("I have started the converter")
      When("I enter 23 o'clock")
      Then("Third row : All the lamps are illuminated in red")
    }
  }

}
