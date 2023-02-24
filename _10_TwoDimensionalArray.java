package All_Tasks_up_to_24;

public class _10_TwoDimensionalArray {
    public static void main(String[] args) {

        printArray(7, 5);
    }

    // 
    //    4. Ну и для особо отличившихся. Написать метод, который
    //    генерирует двумерный массив длиной N и высотой H
    //    Далее заполняет получившийся массив числами от 1 до W по спирали.
    //    Например массив [ ][ ][ ][ ]
    //            [ ][ ][ ][ ]
    //            [ ][ ][ ][ ]
    //    имеет N == 4 and H == 3 и вид [ 1 ][ 2 ][ 3 ][ 4 ]
    //            [10][11][12 ][ 5 ]
    //            [9 ][8 ][ 7 ][ 6 ]

    public static void printArray(int n, int h) {
        int[][] array = new int[h][n];
        int counter = 1; // счетчик
        int left = 0; // задаем левую границу
        int right = n - 1; // задаем правую границу
        int top = 0;   // задаем верхнюю границу
        int bottom = h - 1; // задаем нижнюю границу

        while (counter <= n * h) { // пока счетчик меньше количества элементов в массиве
            for (int i = left; i <= right; i++) { // заполняем верхнюю строку
                array[top][i] = counter++; 
            }
            top++; // уменьшаем верхнюю границу
            for (int i = top; i <= bottom; i++) { // заполняем правую колонку
                array[i][right] = counter++; 
            }
            right--; // уменьшаем правую границу
            for (int i = right; i >= left; i--) { // заполняем нижнюю строку
                array[bottom][i] = counter++;
            }
            bottom--; // уменьшаем нижнюю границу
            for (int i = bottom; i >= top; i--) { // заполняем левую колонку
                array[i][left] = counter++;
            }
            left++; // увеличиваем левую границу
        }
        for (int i = 0; i < h; i++) {   // выводим массив на экран
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
