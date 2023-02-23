import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * HT
         *
         * дан массив, надо:
         * - если массив длины больше чем 4 - 3ий, и  4ий по минимальности элемент
         * если меньше то сообщение что массив меньше
         *
         * - заполнить массив числами фибоначчи
         */


        int[] array = {222, 31, 144, 3, 5, 88, 99, 4, 10};

        int minVal1 = Integer.MAX_VALUE;
        int minVal2 = Integer.MAX_VALUE;
        int minVal3 = Integer.MAX_VALUE;
        int minVal4 = Integer.MAX_VALUE;

        if (array.length < 4) {
            System.out.println("Array is too small");
        } else {
            for (int i : array) {
                if (i <= minVal1) {
                    minVal4 = minVal3;
                    minVal3 = minVal2;
                    minVal2 = minVal1;
                    minVal1 = i;
                } else if (i <= minVal2) {
                    minVal4 = minVal3;
                    minVal3 = minVal2;
                    minVal2 = i;
                } else if (i <= minVal3) {
                    minVal4 = minVal3;
                    minVal3 = i;
                } else if (i < minVal4) {
                    minVal4 = i;
                }
            }
            System.out.println("Min: " + minVal1);
            System.out.println("Second min: " + minVal2);
            System.out.println("Third min: " + minVal3);
            System.out.println("Fourth min: " + minVal4);
        }

        int n = 15;
        int[] fibArr = new int[n];
        fibArr[0] = 0;
        fibArr[1] = 1;
        for (int i = 2; i < n; i++) {
            fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
        }
        System.out.println(Arrays.toString(fibArr));

    }
}