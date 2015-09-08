package pl.kmi.euler.problem4

/**
 * Problem 4: Largest palindrome product (https://projecteuler.net/problem=4)
 *
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
object Problem4Solution {
  def calculateLargestPalindromeProduct:Unit = {
    val largestPalindrome = new LargestPalindrome(3)
    println("Largest palindrome from the product of two 3-digit numbers is " + largestPalindrome.value)
  }

}
