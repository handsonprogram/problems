package com.morsu.problems;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;


public class CompareAliceAndBobTest {

    @Test
    public void compareAliceBobWithValidInput() {
        List<Integer> alice = Arrays.asList(1,2,3);
        List<Integer> bob = Arrays.asList(5,2,1);
        List<Integer> result = CompareAliceAndBob.compare(alice,bob);
        assertEquals("Results not matching. Alice should be 1", Integer.valueOf(1), result.get(0));
        assertEquals("Results not matching. Bob should be 1", Integer.valueOf(1), result.get(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void aliceWithEmptyInput() {
        List<Integer> alice = new ArrayList<>();
        List<Integer> bob = Arrays.asList(5,2,1);
        CompareAliceAndBob.compare(alice, bob);
    }

    @Test(expected = IllegalArgumentException.class)
    public void bobWithEmptyInput() {
        List<Integer> alice = Arrays.asList(1,2,3);
        List<Integer> bob = new ArrayList<>();
        CompareAliceAndBob.compare(alice, bob);
    }

    @Test(expected = NullPointerException.class)
    public void aliceWithNullInput() {
        List<Integer> alice = null;
        List<Integer> bob = Arrays.asList(1,2,3);
        CompareAliceAndBob.compare(alice, bob);
    }

    @Test(expected = NullPointerException.class)
    public void bobWithNullInput() {
        List<Integer> alice = Arrays.asList(1,2,3);
        List<Integer> bob = null;

        CompareAliceAndBob.compare(alice, bob);
    }

    @Test(expected = RuntimeException.class)
    public void aliceInputSizeGreaterThanBobInputSize() {
        List<Integer> alice = Arrays.asList(1,2,3,4);
        List<Integer> bob = Arrays.asList(6,7,8);

        CompareAliceAndBob.compare(alice, bob);
    }

    @Test(expected = RuntimeException.class)
    public void bobInputSizeGreaterThanAliceInputSize() {
        List<Integer> alice = Arrays.asList(1,2,3);
        List<Integer> bob = Arrays.asList(6,7,8,9);
        CompareAliceAndBob.compare(alice, bob);
    }
}