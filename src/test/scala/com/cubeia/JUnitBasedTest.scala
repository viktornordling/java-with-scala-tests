package com.cubeia

import org.junit.Test
import junit.framework.Assert.assertEquals


class JUnitBasedTest {

  @Test
  def testSomething = assertEquals(15, new Calculator().multiply(3, 5))

  @Test
  def testSomethingElse = assertEquals(10, new Calculator().multiply(2, 5));


}