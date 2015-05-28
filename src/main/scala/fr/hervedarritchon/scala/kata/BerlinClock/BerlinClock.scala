package fr.hervedarritchon.scala.kata.berlinclock

/**
 * Created by Hervé Darritchon on 23/05/15.
 *
 */
object BerlinClock {

  val time: Array[String] = new Array[String](5)

  def convert(time: codes.reactive.scalatime.LocalTime): Array[String] = {
    this.time(0)= (time.getMinute % 5) match {
      case 0 => "OOOO"
      case 1 => "YOOO"
      case 2 => "YYOO"
      case 3 => "YYYO"
      case 4 => "YYYY"
    }
    this.time(1)= (time.getMinute / 5 ) match {
      case 0 => "OOOOOOOOOOO"
      case 1 => "YOOOOOOOOOO"
      case 2 => "YYOOOOOOOOO"
      case 3 => "YYROOOOOOOO"
      case 4 => "YYRYOOOOOOO"
      case 5 => "YYRYYOOOOOO"
      case 6 => "YYRYYROOOOO"
      case 7 => "YYRYYRYOOOO"
      case 8 => "YYRYYRYYOOO"
      case 9 => "YYRYYRYYROO"
      case 10 => "YYRYYRYYRYO"
      case 11 => "YYRYYRYYRYY"
    }
    this.time(2)= (time.getHour % 5) match {
      case 0 => "OOOO"
      case 1 => "ROOO"
      case 2 => "RROO"
      case 3 => "RRRO"
      case 4 => "RRRR"
    }
    this.time(3)= (time.getHour / 5) match {
      case 0 => "OOOO"
      case 1 => "ROOO"
      case 2 => "RROO"
      case 3 => "RRRO"
      case 4 => "RRRR"
    }
    this.time(4)= (time.getSecond % 2) match {
      case 0 => "O"
      case 1 => "Y"
    }
    this.time
  }

  def start() = {
  }

}
