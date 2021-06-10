
object FizzBuzz {
  def print(n: Int): String = {
     (1 to n).map {
       case i if i % 3 == 0 && i % 5 == 0 => "FizzBuzz"
       case i if i % 3 == 0 => "Fizz"
       case i if i % 5 == 0 => "Buzz"
       case i => i
     }.mkString("\n")
  }
}
