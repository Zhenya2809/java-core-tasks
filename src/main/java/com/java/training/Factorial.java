package com.java.training;

public class Factorial {

    /**
     * Реализуйте метод getFactorial(int number) который вовзращает факториал числа.
     */
    public int getFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

}


//n! =1*2....n