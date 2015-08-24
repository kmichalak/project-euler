package pl.kmi.euler.problem3

class PrimeFactor(largeNumber: Long) {

  def value: Long = {

    def largestPrimeFactor(currentResult: Long, stepNumber: Int): Long = stepNumber < currentResult match {
      case true => currentResult % stepNumber match {
        case 0 => largestPrimeFactor(currentResult / stepNumber, stepNumber - 1)
        case _ => largestPrimeFactor(currentResult, stepNumber + 1)
      }
      case false => stepNumber
    }

    largestPrimeFactor(largeNumber, 2)
  }

}
