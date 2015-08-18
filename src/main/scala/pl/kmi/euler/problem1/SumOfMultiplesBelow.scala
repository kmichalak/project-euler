package pl.kmi.euler.problem1

class SumOfMultiplesBelow (numbersLimit:Int) {

  def value = {
    val lowestPossibleNumber: Int = numbersLimit - 1
    val sumOfMultiplesOf3 : Int = (1 to lowestPossibleNumber / 3).map(value => value * 3).sum
    val sumOfMultiplesOf5 : Int = (1 to lowestPossibleNumber / 5).map(value => value * 5).sum
    val sumOfCommonMultiplesOf3And5 : Int = (1 to lowestPossibleNumber / 15).map(value => value * 15).sum
    sumOfMultiplesOf3 + sumOfMultiplesOf5 - sumOfCommonMultiplesOf3And5
  }

}
