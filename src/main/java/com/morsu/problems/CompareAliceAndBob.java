package com.morsu.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CompareAliceAndBob {

    static List<Integer> compare(final List<Integer> alice, final List<Integer> bob) {
        List<Integer> result = new ArrayList<>();

        Objects.requireNonNull(alice);
        Objects.requireNonNull(bob);

        if (alice.isEmpty() || bob.isEmpty())
            throw new IllegalArgumentException("Bob or Alice is empty");

        if (alice.size() != bob.size())
            throw new RuntimeException("Alice & Bob input size must be same");

        int aliceCount = 0;
        int bobCount = 0;

        for (int i = 0; i < alice.size(); i ++) {
            if (alice.get(i) > bob.get(i)) aliceCount++;
            if (alice.get(i) < bob.get(i)) bobCount++;
        }
        result.add(aliceCount);
        result.add(bobCount);

        return  result;
    }
}
