package pl.kmi.euler.problem2

import org.scalatest.{FlatSpec, Matchers}

class EvenFibonacciNumbersSpec extends FlatSpec with Matchers {

  "A sum of even-valued terms that do not exceed 0" should "equal 1" in {
    val sum = new SumOfEvenFibonacciNumbers(0)
    sum.value should be (0)
  }

  "A sum of even-valued terms that do not exceed 1" should "equal 0" in {
    val sum = new SumOfEvenFibonacciNumbers(1)
    sum.value should be (0)
  }

  "A sum of even-valued terms that do not exceed 2" should "equal 1" in {
    val sum = new SumOfEvenFibonacciNumbers(2)
    sum.value should be (2)
  }

  "A sum of even-valued terms that do not exceed 3" should "equal 4" in {
    val sum = new SumOfEvenFibonacciNumbers(3)
    sum.value should be (2)
  }

  "A sum of even-valued terms that do not exceed 10" should "equal 9" in {
    val sum = new SumOfEvenFibonacciNumbers(10)
    sum.value should be (10)
  }

  "A sum of even-valued terms that do not exceed 20" should "equal 22" in {
    val sum = new SumOfEvenFibonacciNumbers(20)
    sum.value should be (10)
  }

  "A sum of even-valued terms that do not exceed 30" should "equal 22" in {
    val sum = new SumOfEvenFibonacciNumbers(30)
    sum.value should be (10)
  }

  "A sum of even-valued terms that do not exceed 90" should "equal 187" in {
    val sum = new SumOfEvenFibonacciNumbers(90)
    sum.value should be (44)
  }

  "A sum of even-valued terms that do not exceed 4 000" should "equal 187" in {
    val sum = new SumOfEvenFibonacciNumbers(4000)
    sum.value should be (3382)
  }

  "A sum of even-valued terms that do not exceed 40 000" should "equal 187" in {
    val sum = new SumOfEvenFibonacciNumbers(40000)
    sum.value should be (14328)
  }

  "A sum of even-valued terms that do not exceed 400 000" should "equal 187" in {
    val sum = new SumOfEvenFibonacciNumbers(400000)
    sum.value should be (257114)
  }

  "A sum of even-valued terms that do not exceed 4 000 000" should "equal 187" in {
    val sum = new SumOfEvenFibonacciNumbers(4000000)
    sum.value should be (4613732)
  }

}
