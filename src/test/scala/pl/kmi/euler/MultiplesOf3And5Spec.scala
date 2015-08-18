package pl.kmi.euler

import org.scalatest.{Matchers, FlatSpec}

class MultiplesOf3And5Spec extends FlatSpec with Matchers {
  "A sum of all multiples of 3 and 5 below 10" should "equal 23" in {
    val sum = new SumOfMultiplesBelow(10)
    sum.value should be (23)
  }
}
