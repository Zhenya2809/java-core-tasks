package com.java.training;

public class ArrayBalance {

    /**
     * Given an array, return true if there is a place to split the array so that
     * the sum of the numbers on one side is equal to the sum of the numbers on the
     * other side.
     */
    public boolean canBalance(int[] array) {
        if (array.length == 0) {
            return false;
        }
        int left = 0;
        int right = 0;
        for (int j = 0; j < array.length; j++) {
            right += array[j];
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (left != right) {
                left += array[i];
                right -= array[i];
            }
        }
        return left == right;
    }

}
