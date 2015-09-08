package pl.kmi.euler.problem4

class LargestPalindrome(numberOfDigits: Int) {

  def value: Int = {

    val maxVal = (for (power <- 1 to numberOfDigits) yield scala.math.pow(10, power - 1) * 9).sum.toInt
    val numberOfSteps = maxVal / 11

    def calculate(first: Int, second: Int, currentResult: Int): Int = {

      val possiblePalindrome: PalindromicInt = new PalindromicInt(first * second)

      possiblePalindrome.isPalindrome match {

        case true => second match {
          case 0 => possiblePalindrome.value > currentResult match {
            case true => possiblePalindrome.value
            case false => currentResult
          }
          case _ => first match {
            case 0 => possiblePalindrome.value > currentResult match {
              case true => calculate(maxVal, second - 11, possiblePalindrome.value)
              case false => calculate(maxVal, second - 11, currentResult)
            }
            case _ => possiblePalindrome.value > currentResult match {
              case true => calculate(first - 1, second, possiblePalindrome.value)
              case false => calculate(first - 1, second, currentResult)
            }
          }

        }

        case false => second match {
          case 0 => currentResult
          case _ => first match {
            case 0 => calculate(maxVal, second - 11, currentResult)
            case _ => calculate(first - 1, second, currentResult)
          }
        }

      }

    }

    calculate(maxVal, numberOfSteps * 11, 0)
  }

}
