package pl.kmi.euler.problem3

import org.scalatest.{Matchers, FlatSpec}

class LargestPrimeFactorSpec extends FlatSpec with Matchers {

  "The biggest prime factor for 13195" should "equal 29" in {
    val biggestPrimeFactor = new PrimeFactor(13195)
    biggestPrimeFactor.value should be (29)
  }

  "The biggest prime factor for 12" should "equal 3" in {
    val biggestPrimeFactor = new PrimeFactor(12)
    biggestPrimeFactor.value should be (3)
  }

  "The biggest prime factor for 1" should "equal 1" in {
    val biggestPrimeFactor = new PrimeFactor(1)
    biggestPrimeFactor.value should be (1)
  }

  "The biggest prime factor for 600851475143" should "equal 6857" in {
    val biggestPrimeFactor = new PrimeFactor(600851475143L)
    biggestPrimeFactor.value should be (6857)
  }
}
