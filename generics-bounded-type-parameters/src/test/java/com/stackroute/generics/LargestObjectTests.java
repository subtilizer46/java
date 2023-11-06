package com.stackroute.generics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LargestObjectTests {
    private LargestObject largestObject;

    private static final String MESSAGE = "Check the logic of your method findLargestNumber";

    @BeforeEach
    public void setUp() {
        largestObject = new LargestObject();
    }

    @AfterEach
    public void tearDown() {
        largestObject = null;
    }

    @Test
    public void givenInputOfIntegersThenReturnResult() {
        int numberOne = 10;
        int numberTwo = 11;
        int numberThree = 12;
        assertEquals(12, largestObject.<Integer>findLargestNumber(numberOne, numberTwo, numberThree), MESSAGE);
    }

    @Test
    public void givenInputOfFloatsThenReturnResult() {
        float numberOne = 2.0f;
        float numberTwo = 3.55f;
        float numberThree = 0.0f;
        assertEquals(3.55f, largestObject.<Float>findLargestNumber(numberOne, numberTwo, numberThree), MESSAGE);
    }

    @Test
    public void givenInputOfDoublesThenReturnResult() {
        double numberOne = 8.9;
        double numberTwo = 9.9;
        double numberThree = 3.7;
        assertEquals(9.9, largestObject.<Double>findLargestNumber(numberOne, numberTwo, numberThree), MESSAGE);
    }

    @Test
    public void givenInputOfBytesThenReturnResult() {
        byte numberOne = 6;
        byte numberTwo = 1;
        byte numberThree = 7;
        assertEquals((byte) 7, largestObject.<Byte>findLargestNumber(numberOne, numberTwo, numberThree), MESSAGE);
    }

    @Test
    public void givenInputOfLongThenReturnResult() {
        long numberOne = 9;
        long numberTwo = 66;
        long numberThree = 24;
        assertEquals(66, largestObject.<Long>findLargestNumber(numberOne, numberTwo, numberThree), MESSAGE);
    }

    @Test
    public void givenInputOfShortThenReturnResult() {
        short numberOne = 83;
        short numberTwo = 26;
        short numberThree = 11;
        assertEquals((short) 83, largestObject.<Short>findLargestNumber(numberOne, numberTwo, numberThree), MESSAGE);
    }

    @Test
    public void givenInputWithNegativeValuesThenReturnResult() {
        int numberOne = -5;
        int numberTwo = -99;
        int numberThree = -50;
        assertEquals(-5, largestObject.<Integer>findLargestNumber(numberOne, numberTwo, numberThree), MESSAGE);
    }

    @Test
    public void givenInputWithoutAPresentValueThenReturnResult() {
        int numberOne = 4;
        int numberTwo = 5;
        int numberThree = 6;
        assertNotEquals(0, largestObject.<Integer>findLargestNumber(numberOne, numberTwo, numberThree), MESSAGE);
    }

    @Test
    public void givenInputWithAllSameValuesThenReturnResult() {
        int numberOne = 0;
        int numberTwo = 0;
        int numberThree = 0;
        assertEquals(0, largestObject.<Integer>findLargestNumber(numberOne, numberTwo, numberThree), MESSAGE);
    }
}
