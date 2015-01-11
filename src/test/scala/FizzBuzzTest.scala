import org.scalatest.FunSuite

class FizzBuzzTest extends FunSuite{

  test("print out numbers 1 to 20 with each multiple of 3 being Fizz") {
    val expectedResult =
      """1
        |2
        |Fizz
        |4
        |5
        |Fizz
        |7
        |8
        |Fizz
        |10
        |11
        |Fizz
        |13
        |14
        |Fizz
        |16
        |17
        |Fizz
        |19
        |20
      """.stripMargin.trim
    assert(expectedResult === FizzBuzz.print(20))
  }

}
