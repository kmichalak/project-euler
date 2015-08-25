package pl.kmi.euler.problem3

class PrimeFactor(largeNumber: Long) {

  def value: Long = {

    def largestPrimeFactor(currentResult: Long, stepNumber: Long): Long = largeNumber match {
      case 1 => 1
      case _ => stepNumber < currentResult match {
        case true => currentResult % stepNumber match {
          case 0 => largestPrimeFactor(currentResult / stepNumber, stepNumber)
          case _ => largestPrimeFactor(currentResult, stepNumber + 1)
        }
        case false => stepNumber
      }
    }

    largestPrimeFactor(largeNumber, 2)
  }

}
