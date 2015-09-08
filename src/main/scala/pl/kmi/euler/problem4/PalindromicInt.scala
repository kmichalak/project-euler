package pl.kmi.euler.problem4

class PalindromicInt(intValue:Int) {

  def isPalindrome:Boolean = {
    val reversed = intValue.toString.sliding(1).toList.reverse.mkString("").toInt
    reversed == intValue
  }

  def value:Int = intValue

}
