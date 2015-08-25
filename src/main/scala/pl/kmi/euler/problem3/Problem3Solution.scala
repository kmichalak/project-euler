package pl.kmi.euler.problem3

/**
 * Problem 3: Largest prime factor (https://projecteuler.net/problem=3)
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
object Problem3Solution {
  def calculateLargestPrimeFactorOf600851475143: Unit = {
    val largestPrimeFactor = new PrimeFactor(600851475143L)
    println("Largest prime factor of number 600851475143 is " + largestPrimeFactor.value)
  }
}
