package pl.kmi.euler.problem4

import org.scalatest.{Matchers, FlatSpec}

class LargestPalindromeSpec extends FlatSpec with Matchers {

  "Largest palindrome made from product of 2-digit numbers" should "be 9009" in {
    val palindrome = new LargestPalindrome(2)
    palindrome.value should be (9009)
  }


  "Largest palindrome made from product of 3-digit numbers" should "be 906609" in {
    val palindrome = new LargestPalindrome(3)
    palindrome.value should be (906609)
  }

}
