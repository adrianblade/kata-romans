package example

object Romans {

  val matrix = List(
    Map(0 -> "I", 1 -> "V", 2 -> "X"),
    Map(0 -> "X", 1 -> "L", 2 -> "C"),
    Map(0 -> "C", 1 -> "D", 2 -> "M"),
    Map(0 -> "M", 1 -> "?", 2 -> "??")
  )

  def roman(number: Int): String = {
    val thousands = number / 1000
    val hundreds = (number - thousands * 1000) / 100
    val tens = (number - hundreds * 100 - thousands * 1000) / 10
    val units = number % 10
    translate(thousands, 3) + translate(hundreds, 2) + translate(tens, 1) + translate(units, 0)
  }

  def translate(number: Int, pos: Int) = {
    number match {
      case n if n <= 3 => matrix(pos)(0) * n
      case 4 => matrix(pos)(0) + matrix(pos)(1)
      case 9 => matrix(pos)(0) + matrix(pos)(2)
      case 10 => matrix(pos)(2)

      case n if n >= 5 => matrix(pos)(1) + matrix(pos)(0) * (n - 5)
      case _ => throw new RuntimeException

    }


  }
}
