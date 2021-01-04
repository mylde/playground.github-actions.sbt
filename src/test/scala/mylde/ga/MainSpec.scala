package mylde.ga

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

/**
 */
class MainSpec extends AnyFlatSpec with should.Matchers {
  it should "match" in {
    new Main().run() should be ("Hello")
  }
}
