package com.morsu.problems;

/*
Given a range of numbers [x, y] and an integer q.
Multiply all the numbers in the range by q and return the count of all the numbers which
have no same digits as the corresponding product obtained.

Ex- If x=10, y=12, q=2. Then the products corresponding to 10, 11, 12 are 20, 22, 24.
The count will be 1 as only 22 has all different digits than 11.

 */
public class MultiplyNumbersInRange {

    public static int findUniqueDigitCount(int x, int y, int q) {
        //Integer[] multiplier = IntStream.range(x,y+1).boxed().collect(Collectors.gropuingBy(e -> e, findDigitInNumber()))

        int counter = 0;


        for ( int i= x; i <= y; i++) {
            int number = i;
            boolean foundDigit = false;
            while (number > 0) {
                if (findDigitInNumber(number%10, i*q)) {
                    foundDigit = true;
                    break;
                }
                number = number / 10;
            }

            if (!foundDigit) counter++;
        }

        return counter;
    }

    public static boolean findDigitInNumber(int digit, int number) {
        while ( number > 0) {
            if ( number % 10 == digit ) 
               break;
            
            number = number / 10;
        }

        return (number > 0);
    }

    public static void main(String args[]) {
        System.out.println("Count of unique multiplier of digits is between range 10, 12: "+findUniqueDigitCount(10,12,2));

    }   

}
