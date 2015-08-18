package pl.kmi.euler

class SumOfMultiplesBelow (numbersLimit:Int) {

  def value = {
    val numberOfMultiplesOf3 : Int = (numbersLimit - 1) / 3
    val numberOfMultiplesOf5 : Int = (numbersLimit - 1) / 5
    val numberOfCommonMultiplesOf3And5 : Int = (numbersLimit - 1) / 15

    var sumOfMultiplesOf3 : Int = 0
    for (stepNumber <- 1 to numberOfMultiplesOf3) {
      sumOfMultiplesOf3 += stepNumber * 3
    }

    var sumOfMultiplesOf5 : Int = 0
    for (stepNumber <- 1 to numberOfMultiplesOf5) {
      sumOfMultiplesOf5 += stepNumber * 5
    }

    var sumOfCommonMultiplesOf3And5 : Int = 0
    for (stepNumber <- 1 to numberOfCommonMultiplesOf3And5) {
      sumOfCommonMultiplesOf3And5 += stepNumber * 15
    }

    sumOfMultiplesOf3 + sumOfMultiplesOf5 - sumOfCommonMultiplesOf3And5

  }

}
