package pl.kmi.euler.problem1

import org.scalatest.{FlatSpec, Matchers}

class MultiplesOf3And5Spec extends FlatSpec with Matchers {

  "A sum of all multiples of 3 and 5 that are below 10" should "equal 23" in {
    val sum = new SumOfMultiplesBelow(10)
    sum.value should be (23)
  }

  "A sum of all multiples of 3 and 5 that are below 20" should "equal 78" in {
    val sum = new SumOfMultiplesBelow(20)
    sum.value should be (78)
  }

  "A sum of all multiples of 3 and 5 that are below 30" should "equal 195" in {
    val sum = new SumOfMultiplesBelow(30)
    sum.value should be (195)
  }

}
