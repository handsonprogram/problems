package com.morsu.problems;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class PlusMinusFractionProblem {

    static BigDecimal[] plusMinusFractions(int[] inputArray) {
        BigDecimal[] result = new BigDecimal[3];

        double positivesCount = 0;
        double negativesCount = 0;
        double zeroCount = 0;


        for ( int i = 0 ; i < inputArray.length; i++)
        {
            if ( inputArray[i] > 0 ) positivesCount++;
            else if ( inputArray[i] < 0) negativesCount++;
            else zeroCount++;
        }

        result[0] = new BigDecimal(positivesCount).divide(new BigDecimal(inputArray.length),5,RoundingMode.HALF_UP);
        result[1] = new BigDecimal(negativesCount).divide(new BigDecimal(inputArray.length),5,RoundingMode.HALF_UP);
        result[2] = new BigDecimal(zeroCount).divide(new BigDecimal(inputArray.length),5,RoundingMode.HALF_UP);

        Arrays.stream(result).forEach(System.out::println);

        return result;
    }

    static void otherWay(int[] inputArray) {
        double fractionPositive = 0;
        double fractionZero = 0;
        double fractionNegative = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > 0) fractionPositive += 1;
            else if (inputArray[i] == 0) fractionZero += 1;
            else if (inputArray[i] < 0) fractionNegative += 1;
        }

        System.out.println(fractionPositive/inputArray.length);
        System.out.println(fractionNegative/inputArray.length);
        System.out.println(fractionZero/inputArray.length);
    }

    public static void main(String[] args) {
        int[] inputArray = {-4,3,-9,0,4,1 };
        plusMinusFractions(inputArray);
        otherWay(inputArray);
    }
}
