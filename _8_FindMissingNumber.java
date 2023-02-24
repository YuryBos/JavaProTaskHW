package All_Tasks_up_to_24;

public class _8_FindMissingNumber {
    public static void main(String[] args) {
        findMissingNumber(new int[]{1, 0, 2, 8, 6, 5, 4, 7});
        System.out.println(findMissingNumber2(new int[]{8, 6, 5, 4, 9})); // когда числа в массиве не начинаются с 0
    }
    //    Дан массив чисел, в котором есть все числа от 0 (!!!) до N. Все эти числа в единственном экземпляре.
    //    Расположены в разнобой. Одно число в этом массиве пропущено (Например {9 6 5 4 7} - это 8).
    //    Найти пропущенное число
    public static void findMissingNumber(int[] array ) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) { // сумма всех чисел в массиве
            sum += array[i];
        }
        int sum2 = 0;
        for (int i = 0; i <= array.length; i++) { // сумма всех чисел от 0 до N
            sum2 += i;
        }
        System.out.println(sum2 - sum); // разница между суммой всех чисел в массиве и суммой всех чисел от 0 до N - это пропущенное число
    }
    public static int findMissingNumber2(int[] nums) { // XOR
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= i ^ nums[i];

            // если в массиве есть все числа от 0 до N, кроме одного, то результат XOR операции
            // будет равен пропущенному числу (потому что все числа в массиве встречаются по 2 раза
            // - 1 раз в XOR операции с i, 1 раз в XOR операции с nums[i]
            // кроме пропущенного числа, которое встречается только 1 раз)
            // также если числа в массиве НЕ начинаются с 0, то нужно добавить к результату XOR операции
            // длину массива (nums.length)

            // например:
            // nums = {8, 6, 5, 4, 9}
            // nums.length = 5
            // result = 8 ^ 6 ^ 5 ^ 4 ^ 9 ^ 5 = 2
            // result ^ nums.length = 2 ^ 5 = 7

            /*
        i
            0   0000
            1   0001
            2   0010
            3   0011
            4   0100
    nums[i]
            8	1000
            6	0110
            5	0101
            4	0100
            9	1001
            	         nums.length        7	0111
                0010    ^   0101         >      0111
             */
        }
        return result ^ nums.length;
    }
}
