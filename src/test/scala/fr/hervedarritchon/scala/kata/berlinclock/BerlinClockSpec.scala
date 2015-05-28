package fr.hervedarritchon.scala.kata.berlinclock

import codes.reactive.scalatime.LocalTime
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
      BerlinClock.start()
      When("I enter Twelve o'clock")
      val berlinClock: Array[Array[String]] = BerlinClock.convert(LocalTime.of(12, 0, 0))
      Then("First row : No lamp is illuminated")
      berlinClock should be("OOOO")
    }

    scenario("It's twelve past 2mn so the first two lamps from the bottom line are illuminated") {
      Given("I have started the converter")
      BerlinClock.start()
      When("I enter Twelve o'clock past two")
      val berlinClock: Array[Array[String]] = BerlinClock.convert(LocalTime.of(12, 2, 0))
      Then("First row : The first two lamps are illuminated")
      berlinClock should be("YYOO")
    }

    scenario("It's twelve past 4mn so all the lamps from the bottom line are illuminated") {
      Given("I have started the converter")
      BerlinClock.start()
      When("I enter Twelve o'clock past four")
      val berlinClock: Array[Array[String]] = BerlinClock.convert(LocalTime.of(12, 4, 0))
      Then("First row : All the lamps are illuminated")
      berlinClock should be("YYYY")
    }

    scenario("It's twelve past 5mn so no lamp is illuminated") {
      Given("I have started the converter")
      BerlinClock.start()
      When("I enter Twelve o'clock past five")
      val berlinClock: Array[Array[String]] = BerlinClock.convert(LocalTime.of(12, 5, 0))
      Then("First row : No lamp is illuminated")
      berlinClock should be("OOOO")

    }
  }

  feature("As a clock user I want to be able to see five minutes. So that I can tell higher minute amounts more easily at a glance") {
    scenario("It's twelve past 5mn. So only the first lamp from the second line is illuminated") {
      Given("I have started the converter")
      BerlinClock.start()
      When("I enter Twelve o'clock past five")
      val berlinClock: Array[Array[String]] = BerlinClock.convert(LocalTime.of(12, 5, 0))
      Then("Second row : the first lamp is illuminated")
      berlinClock should be("YOOOOOOOOOO")
    }

    scenario("It's twelve past 15mn. So the first 3 lamps from the second line are illuminated and the third is red") {
      Given("I have started the converter")
      BerlinClock.start()
      When("I enter Twelve o'clock past fifteen")
      val berlinClock: Array[Array[String]] = BerlinClock.convert(LocalTime.of(12, 15, 0))
      Then("Second row : the first 3 lamps from the second line are illuminated and the third is red")
      berlinClock should be("YYROOOOOOOO")
    }

    scenario("It's twelve past 45mn. So the first 9 lamps from the second line are illuminated and the third, the sixth and the ninth are illuminated in red") {
      Given("I have started the converter")
      BerlinClock.start()
      When("I enter Twelve o'clock past forty five")
      val berlinClock: Array[Array[String]] = BerlinClock.convert(LocalTime.of(12, 45, 0))
      Then("Second row : the first 9 lamps from the second line are illuminated and the third, the sixth and the ninth are illuminated in red")
      berlinClock should be("YYRYYRYYROO")
    }

    scenario("It's 12:59. So all the lamps are illuminated and the third, the sixth and the ninth are illuminated in red") {
      Given("I have started the converter")
      BerlinClock.start()
      When("I enter 12:59")
      val berlinClock: Array[Array[String]] = BerlinClock.convert(LocalTime.of(12, 59, 0))
      Then("Second row : All the lamps are illuminated and the third, the sixth and the ninth are illuminated in red")
      berlinClock should be("YYRYYRYYRYY")
    }

  }

  feature("As a clock user. I want to be able to see single hours. So that I can tell what hour it is") {
    scenario("It's midnight so no lamp from the third line is illuminated") {
      Given("I have started the converter")
      BerlinClock.start()
      When("I enter 12 o'clock")
      val berlinClock: Array[Array[String]] = BerlinClock.convert(LocalTime.of(12, 0, 0))
      Then("Third row : No lamp is illuminated")
      berlinClock should be("OOOO")
    }

    scenario("It's 2 o'clock so the first two lamps from the third line are illuminated") {
      Given("I have started the converter")
      BerlinClock.start()
      When("I enter 2 o'clock")
      val berlinClock: Array[Array[String]] = BerlinClock.convert(LocalTime.of(2, 0, 0))
      Then("Third row : The first two lamps are illuminated")
      berlinClock should be("RROO")
    }

    scenario("It's 4 o'clock so all the lamps from the third line are illuminated") {
      Given("I have started the converter")
      BerlinClock.start()
      When("I enter 4 o'clock")
      val berlinClock: Array[Array[String]] = BerlinClock.convert(LocalTime.of(2, 0, 0))
      Then("Third row : All the lamps are illuminated")
      berlinClock should be("RROO")
    }

    scenario("It's 5 o'clock so no lamp is illuminated") {
      Given("I have started the converter")
      BerlinClock.start()
      When("I enter 5 o'clock")
      val berlinClock: Array[Array[String]] = BerlinClock.convert(LocalTime.of(5, 0, 0))
      Then("Third row : No lamp is illuminated")
      berlinClock should be("OOOO")
    }
  }

  feature("As a clock user. I want to be able to see five hours. So that I can tell higher hour amounts more easily at a glance") {
    scenario("It's midnight so no lamp from the fourth line is illuminated") {
      Given("I have started the converter")
      BerlinClock.start()
      When("I enter midnight")
      val berlinClock: Array[Array[String]] = BerlinClock.convert(LocalTime.of(0, 0, 0))
      Then("Fourth row : No lamp is illuminated")
      berlinClock should be("OOOO")
    }

    scenario("It's 13 o'clock so the first two lamps from the fourth line are illuminated") {
      Given("I have started the converter")
      BerlinClock.start()
      When("I enter 13 o'clock")
      val berlinClock: Array[Array[String]] = BerlinClock.convert(LocalTime.of(13, 0, 0))
      Then("Fourth row : The first two lamps are illuminated in red")
      berlinClock should be("RROO")
    }

    scenario("It's 23 o'clock so all the lamps are illuminated") {
      BerlinClock.start()
      Given("I have started the converter")
      When("I enter 23 o'clock")
      val berlinClock: Array[Array[String]] = BerlinClock.convert(LocalTime.of(23, 0, 0))
      Then("Third row : All the lamps are illuminated in red")
      berlinClock should be("RRRR")
    }
  }

  feature("As a clock user. I want to be able to see seconds passing. So that I can see if my clock is working at a glance") {

    scenario("It's midnight so no lamp from the fifth line is illuminated") {
      Given("I have started the converter")
      BerlinClock.start()
      When("I enter midnight")
      val berlinClock: Array[Array[String]] = BerlinClock.convert(LocalTime.of(0, 0, 0))
      Then("Fifth row : No lamp is illuminated")
      berlinClock should be("O")
    }

    scenario("It's 00:00:01 so no lamp from the fifth line is illuminated") {
      Given("I have started the converter")
      BerlinClock.start()
      When("I enter 00:00:01")
      val berlinClock: Array[Array[String]] = BerlinClock.convert(LocalTime.of(0, 0, 1))
      Then("Fifth row : The lamp is illuminated")
      berlinClock should be("Y")
    }

  }
}
