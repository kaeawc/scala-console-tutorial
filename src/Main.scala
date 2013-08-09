
object Main {

  val prompt = "Do you want to do something? (y/n)"

  def main(args: Array[String]) {

    val list = args mkString ", "

    println("Here are my args: " + list)

    println(prompt)

    loop

  }

  def loop = {

    while (getYesNo) {

      doSomething

      println(prompt)

    }

  }

  def getYesNo:Boolean = {

    val input = Console.readLine()

    val answer = input.toLowerCase match {
      case "n" => Some(false)
      case "y" => Some(true)
      case _   => None
    }

    (!answer.isEmpty && answer.get)
  }

  def doSomething {

    println("Doing something...")

  }
}
