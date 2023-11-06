package com.stackroute.genericcollection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GenericMapOperationsTests {
    private GenericMapOperations<Integer, Integer> integerMapOperations;
    private GenericMapOperations<String, String> stringMapOperations;
    private GenericMapOperations<Integer, String> bothMapOperations;
    private GenericMapOperations<String, Integer> both2MapOperations;

    @BeforeEach
    public void setUp() {
        // Initialize the integerMapOperations and stringMapOperations before each test
        integerMapOperations = new GenericMapOperations<>(5);
        stringMapOperations = new GenericMapOperations<>(3);
        bothMapOperations = new GenericMapOperations<>(3);
        both2MapOperations = new GenericMapOperations<>(3);
    }

    @Test
    public void testSetAndGetInteger() {
        integerMapOperations.set(1, 10);
        integerMapOperations.set(2, 20);
        integerMapOperations.set(3, 30);

        Integer result1 = integerMapOperations.find(1);
        Integer result2 = integerMapOperations.find(2);
        Integer result3 = integerMapOperations.find(3);

        assertEquals(10, (int) result1);
        assertEquals(20, (int) result2);
        assertEquals(30, (int) result3);
    }

    @Test
    public void testSetAndGetString() {
        stringMapOperations.set("one", "apple");
        stringMapOperations.set("two", "banana");

        String result1 = stringMapOperations.find("one");
        String result2 = stringMapOperations.find("two");

        assertEquals("apple", result1);
        assertEquals("banana", result2);
    }

    @Test
    public void testSetAndGetBoth() {
        bothMapOperations.set(1,"one");
        bothMapOperations.set(2,"two");
        bothMapOperations.set(3,"three");

        String result1 = bothMapOperations.find(1);
        String result2 = bothMapOperations.find(2);
        String result3 = bothMapOperations.find(3);

        assertEquals("one",result1);
        assertEquals("two",result2);
        assertEquals("three",result3);
    }

    @Test
    public void testSetAndGetBoth2() {
        both2MapOperations.set("one",1);
        both2MapOperations.set("two",2);
        both2MapOperations.set("three",3);

        Integer result1 = both2MapOperations.find("one");
        Integer result2 = both2MapOperations.find("two");
        Integer result3 = both2MapOperations.find("three");

        assertEquals(1, result1);
        assertEquals(2, result2);
        assertEquals(3, result3);
    }

    @Test
    public void testSetUpdateValue() {
        integerMapOperations.set(1, 100);
        integerMapOperations.set(1, 200);

        Integer result = integerMapOperations.find(1);

        assertEquals(200, (int) result);
    }

    @Test
    public void testSetWithExceededCapacity() {
        integerMapOperations.set(1,10);
        integerMapOperations.set(2,20);
        integerMapOperations.set(3,30);
        integerMapOperations.set(4,40);
        integerMapOperations.set(5,50);
       integerMapOperations.set(6,60);

        assertNull(integerMapOperations.find(1));
        assertNotNull(integerMapOperations.find(2));
        assertNotNull(integerMapOperations.find(3));
        assertNotNull(integerMapOperations.find(4));
        assertNotNull(integerMapOperations.find(5));
        assertNotNull(integerMapOperations.find(6));
    }

    @Test
    public void testConstructorWithNegativeCapacity() {
        new GenericMapOperations<>(-1);
    }

    @Test
    public void testSetWithNullKey() {
        assertEquals(integerMapOperations.set(null, 10),null);
    }

    @Test
    public void testSetWithNullValue() {
        assertEquals(integerMapOperations.set(1,null),null);
    }

    @Test
    public void testSetWithEmptyKey() {
        assertNull(stringMapOperations.set("", "apple"));
    }

    @Test
    public void testRemoveEldestEntry() {
        stringMapOperations.set("one", "apple");
        stringMapOperations.set("two", "banana");
        stringMapOperations.set("three", "orange");
        stringMapOperations.set("four", "grape");

        assertNull(stringMapOperations.find("one"));
        assertNotNull(stringMapOperations.find("two"));
        assertNotNull(stringMapOperations.find("three"));
        assertNotNull(stringMapOperations.find("four"));
    }
}
