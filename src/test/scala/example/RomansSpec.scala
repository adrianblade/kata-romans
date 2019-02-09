package example

import org.scalatest._

class RomansSpec extends FlatSpec with Matchers {
  "Romans" should "translate one" in {
    Romans.roman(1) shouldEqual "I"
  }
  "Romans" should "translate two" in {
    Romans.roman(2) shouldEqual "II"
  }
  "Romans" should "translate three" in {
    Romans.roman(3) shouldEqual "III"
  }
  "Romans" should "translate four" in {
    Romans.roman(4) shouldEqual "IV"
  }
  "Romans" should "translate 5" in {
    Romans.roman(5) shouldEqual "V"
  }
  "Romans" should "translate 6" in {
    Romans.roman(6) shouldEqual "VI"
  }
  "Romans" should "translate 7" in {
    Romans.roman(7) shouldEqual "VII"
  }
  "Romans" should "translate 8" in {
    Romans.roman(8) shouldEqual "VIII"
  }
  "Romans" should "translate 9" in {
    Romans.roman(9) shouldEqual "IX"
  }
  "Romans" should "translate 10" in {
    Romans.roman(10) shouldEqual "X"
  }
  "Romans" should "translate 11" in {
    Romans.roman(11) shouldEqual "XI"
  }
  "Romans" should "translate 12" in {
    Romans.roman(12) shouldEqual "XII"
  }
  "Romans" should "translate 13" in {
    Romans.roman(13) shouldEqual "XIII"
  }
  "Romans" should "translate 14" in {
    Romans.roman(14) shouldEqual "XIV"
  }
  "Romans" should "translate 15" in {
    Romans.roman(15) shouldEqual "XV"
  }
  "Romans" should "translate 16" in {
    Romans.roman(16) shouldEqual "XVI"
  }
  "Romans" should "translate 17" in {
    Romans.roman(17) shouldEqual "XVII"
  }
  "Romans" should "translate 18" in {
    Romans.roman(18) shouldEqual "XVIII"
  }
  "Romans" should "translate 19" in {
    Romans.roman(19) shouldEqual "XIX"
  }
  "Romans" should "translate 20" in {
    Romans.roman(20) shouldEqual "XX"
  }
  "Romans" should "translate 21" in {
    Romans.roman(21) shouldEqual "XXI"
  }
  "Romans" should "translate 24" in {
    Romans.roman(24) shouldEqual "XXIV"
  }
  "Romans" should "translate 25" in {
    Romans.roman(25) shouldEqual "XXV"
  }
  "Romans" should "translate 49" in {
    Romans.roman(49) shouldEqual "XLIX"
  }
  "Romans" should "translate 121" in {
    Romans.roman(121) shouldEqual "CXXI"
  }
  "Romans" should "translate 1001" in {
    Romans.roman(1001) shouldEqual "MI"
  }
  "Romans" should "translate 2013" in {
    Romans.roman(2013) shouldEqual "MMXIII"
  }
  "Romans" should "translate 3001" in {
    Romans.roman(3001) shouldEqual "MMMI"
  }
}
