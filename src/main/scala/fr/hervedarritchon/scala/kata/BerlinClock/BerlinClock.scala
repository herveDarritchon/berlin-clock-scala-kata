package fr.hervedarritchon.scala.kata.berlinclock

import codes.reactive.scalatime.LocalTime

/**
 * Created by Hervé Darritchon on 23/05/15.
 *
 */
object BerlinClock {

  private def lightLamps(data: List[(Int, List[String])]) = {
    data map Function.tupled((x, xs) => xs.take(x) ++ List.fill(xs.length - x)("O"))
  }

  private def calculateNumberOfLights(time: LocalTime): List[Int] = {
    val seconds = time.getSecond
    val minutes = time.getMinute
    val hours = time.getHour

    List(seconds % 2, hours / 5, hours % 5, minutes / 5, minutes % 5)
  }

  def convert(time: LocalTime) = {
    val timeConverted = new Array[String](5)
    timeConverted
  }

  def convert(clock: List[List[String]], time: LocalTime) = {
    val weird = calculateNumberOfLights(time) zip clock
    val lamps = lightLamps(weird)
    val unknown = lamps.map(x => x mkString (""))
    val timeConverted = unknown.reverse.toArray
    timeConverted
    //new Array[String](5)
  }

  def start(): List[List[String]] = {
    /*
    Light all the lamps of the Berlin Clock
     */
    List(List("Y"), List.fill(4)("R"), List.fill(4)("R"), List.tabulate(11)(index => if ((index + 1) % 3 == 0) "R" else "Y"), List.fill(4)("Y"))
  }

}
