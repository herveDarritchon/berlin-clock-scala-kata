package fr.hervedarritchon.scala.kata

import com.typesafe.scalalogging.LazyLogging
import fr.hervedarritchon.scala.kata.berlinclock.BerlinClock

/**
 * Created by Hervé Darritchon on 23/05/15.
 *
 */
class KataApplication extends LazyLogging {

  def main(args: Array[String]): Unit = {
    logger.debug("Kata starts here.")
    BerlinClock.start()
    logger.debug("Kata stops here.")
  }

}
