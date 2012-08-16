import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers._

class Homework4 extends FunSuite {

  test("can match within case classes") {
    val redirect = Response(302, Map("Location" -> "bed"))
    Homework.locationOf(redirect) should be (Some("bed"))

    val ok = Response(200, Map())
    Homework.locationOf(ok) should be (None)

    val error = Response(500, Map("Location" -> "completly bogus garbage"))
    Homework.locationOf(error) should be (None)
  }
}
