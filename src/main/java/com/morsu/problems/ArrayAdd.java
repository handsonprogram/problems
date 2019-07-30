package com.morsu.problems;

import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ArrayAdd {

    static int addArrayElements(final int[] ar) {
        Objects.requireNonNull(ar);
        return IntStream.of(ar).sum();
    }

    static long addArrayElements(final long[] ar) {
        Objects.requireNonNull(ar);
        return LongStream.of(ar).sum();
    }
}
