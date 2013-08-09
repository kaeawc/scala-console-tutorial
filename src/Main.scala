
object Main {

  val prompt = "Do you want to do something? (y/n)"

  def main(args: Array[String]) {

    val list = args mkString ", "

    println("Here are my args: " + list)

    println(prompt)

    loop

  }

  def loop = {

    while (Console.readLine() != "n") {

      println("Doing something...")

      println(prompt)

    }

  }

}
