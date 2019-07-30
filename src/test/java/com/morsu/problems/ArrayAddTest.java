package com.morsu.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayAddTest {

    @Test
    public void arrayWithElements() {
        int[] inputArray = {1,2,3,4,5};
        int result = ArrayAdd.addArrayElements(inputArray);
        assertEquals("Results not matching. Should be 15", 15,result);
    }

    @Test
    public void arrayWithNegativeElements() {
        int[] inputArray = {1,2,3,4,-5};
        int result = ArrayAdd.addArrayElements(inputArray);
        assertEquals("Results not matching. Should be 5", 5, result);
    }

    @Test
    public void emptyArrayTest() {
        int[] inputArray = {};
        int result = ArrayAdd.addArrayElements(inputArray);
        assertEquals("Results not matching. Should be 0", 0, result);
    }

    @Test(expected = NullPointerException.class)
    public void nullArrayTest() {
        int[] inputArray = null;
        ArrayAdd.addArrayElements(inputArray);
    }

    @Test
    public void arrayWithBigIntegerNumbers() {
        long[] inputArray = {1000000001,1000000002,1000000003,1000000004,1000000005};
        long result = ArrayAdd.addArrayElements(inputArray);
        assertEquals("Results not matching. Should be 1000000015",5000000015L, result);
    }


    @Test(expected = NullPointerException.class)
    public void nullBigIntegerNumberArray() {
        long[] inputArray = null;
        ArrayAdd.addArrayElements(inputArray);
    }
}