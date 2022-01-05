package com.example.rolldice

import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun generate_number() {
        val dice = MainActivity.Dice(6)
        val rollResult = dice.roll()
        assertTrue("the value of roll result was not between 1 and 6", rollResult in 1..6)
    }
}

