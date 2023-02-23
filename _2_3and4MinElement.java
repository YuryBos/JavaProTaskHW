package All_Tasks_up_to_24;
public class _2_3and4MinElement {
    public static void main(String[] args) {
        minElement(new int[]{222, 31, 144, 3, 5, 88, 99, 4, 10});
    }
    /**
     * HT
     * дан массив, надо:
     * - если массив длины больше чем 4 - 3ий, и 4ий по минимальности элемент
     * если меньше то сообщение, что массив меньше
     */
    public static void minElement(int[] array) {

        int minVal1 = Integer.MAX_VALUE; // задаем максимальное значение
        int minVal2 = Integer.MAX_VALUE;
        int minVal3 = Integer.MAX_VALUE;
        int minVal4 = Integer.MAX_VALUE;

        if (array.length < 4) { // если длина массива меньше 4, то выводим сообщение
            System.out.println("Array is too small");
        } else {
            for (int i : array) { // циклом проходим по массиву
                if (i <= minVal1) { // если значение меньше или равно минимальному, то присваиваем его
                    minVal4 = minVal3; // сдвигаем значения
                    minVal3 = minVal2; // сдвигаем значения
                    minVal2 = minVal1; // сдвигаем значения
                    minVal1 = i; // присваиваем значение
                } else if (i <= minVal2) { // если значение меньше или равно второму минимальному, то присваиваем его
                    minVal4 = minVal3;
                    minVal3 = minVal2;
                    minVal2 = i;
                } else if (i <= minVal3) { // если значение меньше или равно третьему минимальному, то присваиваем его
                    minVal4 = minVal3;
                    minVal3 = i;
                } else if (i < minVal4) { // если значение меньше четвертого минимального, то присваиваем его
                    minVal4 = i;
                }
            }
            System.out.println("Min: " + minVal1);
            System.out.println("Second min: " + minVal2);
            System.out.println("Third min: " + minVal3);
            System.out.println("Fourth min: " + minVal4);
        }
    }
}