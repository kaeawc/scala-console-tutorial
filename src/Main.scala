
object Main {

  def main(args: Array[String]) {

    val list = args mkString ", "
    
    val prompt = "Do you want to do something? (y/n)"

    println("Here are my args: " + list)

    println(prompt)

    while (Console.readLine() != "n") {

      println("Doing something...")

      println(prompt)

    }


  }

}
