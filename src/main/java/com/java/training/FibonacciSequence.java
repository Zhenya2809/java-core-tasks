package com.java.training;

public class FibonacciSequence {

    /**
     * <p>Реализуйте метод `getFibonacciNumber(int n)` который возвращает число Фибоначи которое
     * стоит на `n` позиции в последовательности Фибоначчи (начало нумерации с нуля).</p>
     *
     * <p>Пример: n = 8
     * Результат: 21</p>
     */
    public int getFibonacciNumber(int index) {
        int[] array=new int[index+2];
        for (int i = 1; i <= index; i++) {
            array[0]=0;
            array[1]=1;
            array[i+1]=array[i-1]+array[i];

        }
        return array[index];
    }

}
