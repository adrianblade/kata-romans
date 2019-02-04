package example

object Romans {

  val RomanI = "I"
  val RomanV = "V"
  val RomanX = "X"
  val RomanL = "L"
  val RomanC = "C"
  val RomanD = "D"

  def times(ch: String, dec: Int ): String = {
    dec match {
      case 0 => ""
      case _ => ch + times(ch, dec - 1)
    }
  }

  def roman(x: Int): String = {
    if( x == 0 ) return ""
    if( x <= 3 ) return roman( x - 1) + RomanI
    if( x == 4 ) return RomanI + roman( x + 1)
    if( x > 5 && x <= 8 ) return RomanV + roman( x - 5 )
    if( x == 9 ) return RomanI + roman( x + 1)
    if( x > 10 && x <= 25 ) return RomanX + roman( x - 10 )

    val resArr = Map(
      1 -> RomanI,
      5 -> RomanV,
      10 -> RomanX,
      50 -> RomanL,
      100 -> RomanC,
      500 -> RomanD
    )
    return resArr(x)
  }
}
