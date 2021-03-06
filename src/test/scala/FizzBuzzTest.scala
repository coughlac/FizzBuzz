import org.scalatest.FunSuite

class FizzBuzzTest extends FunSuite{

  test("print out numbers 1 to 30 with each multiple of 3 being Fizz, of 5 being Buzz and of both being FizzBuzz") {
    val expectedResult =
      """1
        |2
        |Fizz
        |4
        |Buzz
        |Fizz
        |7
        |8
        |Fizz
        |Buzz
        |11
        |Fizz
        |13
        |14
        |FizzBuzz
        |16
        |17
        |Fizz
        |19
        |Buzz
        |Fizz
        |22
        |23
        |Fizz
        |Buzz
        |26
        |Fizz
        |28
        |29
        |FizzBuzz
      """.stripMargin.trim
    assert(expectedResult === FizzBuzz.print(30))
  }

}
