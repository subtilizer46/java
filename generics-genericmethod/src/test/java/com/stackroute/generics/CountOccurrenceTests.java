package com.stackroute.generics;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CountOccurrenceTests {
    private CountOccurrence countOccurrence;

    private static final String MESSAGE = "Check the logic of your method findCount";

    @BeforeEach
    public void setUp() {
        countOccurrence = new CountOccurrence();
    }

    @AfterEach
    public void tearDown() {
        countOccurrence = null;
    }

    @Test
    public void givenArrayOfIntegersThenReturnResult() {
        Integer[] input = {24, 4, 6, 24, 5, 45, 4, 75, 55, 344, 4, 5, 6, 90};
        int item = 4;
        assertEquals(3, countOccurrence.<Integer>findCount(input, item), MESSAGE);
    }

    @Test
    public void givenArrayOfStringsThenReturnResult() {
        String[] input = {"JAVA", "JRE", "JDK", "JAVA", "JRE", "JAVA", "JAVA", "CODE"};
        String item = "JAVA";
        assertEquals(4, countOccurrence.<String>findCount(input, item), MESSAGE);
    }

    @Test
    public void givenArrayOfFloatsThenReturnResult() {
        Float[] input = {2.4f, 3.55f, 88.0f, 0.0f, 13f, 0.0f, 99f};
        float item = 0;
        assertEquals(2, countOccurrence.<Float>findCount(input, item), MESSAGE);
    }

    @Test
    public void givenArrayOfDoublesThenReturnResult() {
        Double[] input = {2.44, 3.55, 8.0, 0.0, 99.9, 78.3, 9.9, 8.0};
        double item = 8;
        assertEquals(2, countOccurrence.<Double>findCount(input, item), MESSAGE);
    }

    @Test
    public void givenArrayOfBytesThenReturnResult() {
        Byte[] input = {2, 3, 0, 1, 9, 78, 9, 8};
        byte item = 1;
        assertEquals(1, countOccurrence.<Byte>findCount(input, item), MESSAGE);
    }

    @Test
    public void givenArrayOfLongValuesThenReturnResult() {
        Long[] input = {250l, 30l, 0l, 1l, 9l, 78l, 9l, 8l};
        long item = 9;
        assertEquals(2, countOccurrence.<Long>findCount(input, item), MESSAGE);
    }

    @Test
    public void givenArrayOfShortThenReturnResult() {
        Short[] input = {250, 3, 3, 0, 2, 0, 3, 80};
        short item = 3;
        assertEquals(3, countOccurrence.<Short>findCount(input, item), MESSAGE);
    }

    @Test
    public void givenArrayWithNegativeValuesThenReturnResult() {
        Integer[] input = {-24, -4, -6, -24, -5, -5, -4, -5, -5, -10, -5, -6, -90};
        int item = -5;
        assertEquals(5, countOccurrence.<Integer>findCount(input, item), MESSAGE);
    }

    @Test
    public void givenArrayWithoutItemThenReturnResult() {
        Integer[] input = {450, 55, 44, 34, 899, 211, 44, 11, 32};
        int item = 4;
        assertEquals(0, countOccurrence.<Integer>findCount(input, item), MESSAGE);
    }

    @Test
    public void givenArrayWithItemAsNullThenReturnResult() {
        String[] input = {"Java", "C", "C++", "Java", "C"};
        String item = null;
        assertEquals(0, countOccurrence.<String>findCount(input, item), MESSAGE);
    }

    @Test
    public void givenArrayAsNullValuesAndItemAsNullThenReturnResult() {
        String[] input = {null, "Java", null};
        String item = null;
        assertEquals(2, countOccurrence.<String>findCount(input, item), MESSAGE);
    }

}
