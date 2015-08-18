package pl.kmi.euler.problem1

/**
 * Problem 1: Multiples of 3 and 5 (https://projecteuler.net/problem=1)
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
object Problem1Solution {

  def calculateSumOfMultiplesOf3And5ThatAreBelow1000: Unit = {
    val sum = new SumOfMultiplesBelow(1000)
    println("Sum of all multiples of 3 and 5 that are below 1000 equals " + sum.value)
  }

}
