package com.stackroute.exercises;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class StringifyTests {

    private Stringify stringify;
    private String message = "Check the logic in method inputValidator";
    private String errorMessage = "Check the logic in method inputValidator, method should return error string when";

    @BeforeEach
    public void setUp() {
        stringify = new Stringify();
    }

    @AfterEach
    public void tearDown() {
        stringify = null;
    }

    @Test
    public void givenIntegerArrayThenReturnAStringResult() {
        assertEquals("1 2 3 4 5 6 7 8 9 10", stringify.inputValidator(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), message);
    }

    @Test
    public void givenStringArrayThenReturnAStringResult() {
        assertEquals("Hi my name is Joel", stringify.inputValidator(new String[]{"Hi", "my", "name", "is", "Joel"}), message);
    }

    @Test
    public void givenNullThenReturnAnErrorString() {
        assertEquals("Given value is null", stringify.inputValidator(null), errorMessage + "input is null");
    }

    @Test
    public void givenStringArrayWithNullValueThenReturnAnErrorString() {
        assertEquals("Given array contains a null value", stringify.inputValidator(new String[]{"Hi", "my", null, "is", "Joel"}), errorMessage+"input contains null as value");
    }

    @Test
    public void givenStringArrayWithEmptyValueThenReturnAnErrorString() {
        assertEquals("The given array contains one value which is empty or blank space", stringify.inputValidator(new String[]{""}), errorMessage+"input contains value which is empty or blank space");
    }

    @Test
    public void givenDoubleArrayThenReturnAStringResult() {
        assertEquals("11.5 34.7 50.1 200.4 63.5 88.3", stringify.inputValidator(new Double[]{11.5, 34.7, 50.1, 200.4, 63.5, 88.3}), message);
    }

    @Test
    public void givenCharacterArrayThenReturnAStringResult() {
        assertEquals("G o o d M o r n i n g", stringify.inputValidator(new Character[]{'G', 'o', 'o', 'd', 'M', 'o', 'r', 'n', 'i', 'n', 'g'}), message);
    }

}
