package com.cubeia

import org.junit.runner.RunWith
import org.scalatest.matchers.MustMatchers
import org.scalatest.FlatSpec
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CalculatorSpec extends FlatSpec with MustMatchers {

  "Calculator" must "multiply two values" in {
    val calculator = new Calculator;
    calculator.multiply(3, 5) must equal (15)
  }

}


