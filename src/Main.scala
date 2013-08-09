
object Main {

  val prompt = "Do you want to do something? (y/n)"

  /**
   * Main method for this Scala console application.
   * @param args
   */
  def main(args: Array[String]) {

    val list = args mkString ", "

    println("Here are my args: " + list)

    loop

  }

  /**
   * Loop to evaluate user input and then either keep working or stop the program.
   */
  def loop = {

    while (getYesNo) {

      doSomething

    }

  }

  /**
   * Prompts the user for input (y/n)
   * @return
   */
  def getYesNo:Boolean = {

    println(prompt)

    val input = Console.readLine()

    val answer = input.toLowerCase match {
      case "n" => Some(false)
      case "y" => Some(true)
      case _   => None
    }

    (!answer.isEmpty && answer.get)
  }

  /**
   * Work method of the program
   */
  def doSomething {

    println("Doing something...")

  }
}
