package com.java.training;

public class StringSumDigits {

    /**
     * Given a string, return the sum of the digits 0-9 that appear in the string,
     * ignoring all other characters. Return 0 if there are no digits in the string.
     */
    public int sumDigits(String str) {
        int nums = 0;
        String[] array = str.replaceAll("[^-?0-9]+", "").trim().split("");
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals("")) {
                nums += (Integer.parseInt(array[i]));
            } else return 0;
        }
        return nums;
    }
}
