package pl.kmi.euler.problem4

import org.scalatest.{Matchers, FlatSpec}

class PalindromeIntSpec extends FlatSpec with Matchers {

  "Value 9009" should "be palindrome" in {
  	val value = new PalindromicInt(9009)
  	value.isPalindrome should be (true)
  }

  "Value 121" should "be palindrome" in {
  	val value = new PalindromicInt(121)
  	value.isPalindrome should be (true)
  }

  "Value 1234" should "not be palindrome" in {
  	val value = new PalindromicInt(1234)
  	value.isPalindrome should be (false)
  }
	
}