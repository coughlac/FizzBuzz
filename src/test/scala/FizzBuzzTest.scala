import org.scalatest.FunSuite

class FizzBuzzTest  extends FunSuite{

  test("print out numbers 1 to 20") {
    val expectedResult =
      """1
        |2
        |3
        |4
        |5
        |6
        |7
        |8
        |9
        |10
        |11
        |12
        |13
        |14
        |15
        |16
        |17
        |18
        |19
        |20
      """.stripMargin.trim
    assert(expectedResult === FizzBuzz.print(20))
  }

}
