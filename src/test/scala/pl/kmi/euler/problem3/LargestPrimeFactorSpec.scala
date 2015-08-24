package pl.kmi.euler.problem3

import org.scalatest.{Matchers, FlatSpec}

class LargestPrimeFactorSpec extends FlatSpec with Matchers {

  "The biggest prime factor for 13195" should "equal 29" in {
    val biggestPrimeFactor = new PrimeFactor(13195)
    biggestPrimeFactor.value should be (29)
  }

}
