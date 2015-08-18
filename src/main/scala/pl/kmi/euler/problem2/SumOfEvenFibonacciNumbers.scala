package pl.kmi.euler.problem2

class SumOfEvenFibonacciNumbers(valuesLimit: Long) {

  def value: BigInt = {

    def fibonacci_tail(n: Long, a: BigInt, b: BigInt, acc: BigInt, limit: BigInt): BigInt = n match {
      case 0 => acc
      case _ => a + b > limit match {
        case true => acc
        case false => ((a + b) % 2).toInt match {
          case 1 => fibonacci_tail(n - 1, b, a + b, acc, limit)
          case 0 => fibonacci_tail(n - 1, b, a + b, acc + a + b, limit)
        }
      }
    }

    fibonacci_tail(valuesLimit, BigInt(0), BigInt(1), BigInt(0), valuesLimit)
  }

}
