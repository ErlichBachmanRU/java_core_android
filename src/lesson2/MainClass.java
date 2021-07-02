package lesson2;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        /*1*/
        System.out.println("/*1*/");
        createArrOne();
        /*2*/
        System.out.println("/*2*/");
        createArrToo();
        /*3*/
        System.out.println("/*3*/");
        createArrThree();
        /*4*/
        System.out.println("/*4*/");
        int[][] Arr2D = new int[5][5];
        printArr2D(Arr2D);
        String G = "***";
        System.out.println(" " + G + G + G);
        diagonal2D(Arr2D);
        /*5.*/
        System.out.println("/*5*/");
        int[] maxMin = {10, 2, 32, 12, 4, 5436, 2, 34, 8, 76};
        findMinMax(maxMin);
        /*6.*/
        int[] checkArr1 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("/*6*/" + checkArr(checkArr1));

    }

    /*1.Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
    public static void createArrOne() {
        int[] abra = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(abra));

        for (int i = 0; i < abra.length; ++i) {
            if (abra[i] > 0) {
                abra[i] = 0;
            } else {
                abra[i] = 1;
            }
        }
        System.out.println(Arrays.toString(abra));
    }

    /*2.Задать пустой целочисленный массив размером 8.
    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/
    public static void createArrToo() {
        int[] kadabra = new int[8];
        System.out.println(Arrays.toString(kadabra));
        for (int i = 0; i < kadabra.length; ++i) {
            kadabra[i] = i * 3;
        }
        System.out.println(Arrays.toString(kadabra));
    }

    /*3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2*/
    /**/
    public static void createArrThree() {
        int[] arrThree = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arrThree));
        for (int i = 0; i < arrThree.length; ++i) {
            if (arrThree[i] < 6) {
                arrThree[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arrThree));
    }

    /*4.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
    public static void printArr2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void diagonal2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else if (i + j == arr.length - 1) {
                    arr[i][j] = 1;
                }
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }

    /*5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
     * БЕЗ ПОИСКА ПОДСКАЗКИ В ГУГЛ У МЕНЯ НЕ ПОЛУЧИЛОСЬ*/
    public static void findMinMax(int[] arr) {
        int min = arr[0];
        int max = min;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }

    /*6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    если в массиве есть место, в котором сумма левой и правой части массива равны.
    Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
    эти символы в массив не входят*/
    /*Решение по подсказке наставника!Самому не получилось найти решение*/
    public static boolean checkArr(int[] arr) {
        if (arr.length > 0) {
            int oneSum = 0;
            int tooSum = 0;

            for (int i = 0; i <= arr.length; ) {
                for (int one = 0; one <= i; one++) {
                    oneSum += arr[one];
                }
                for (int too = ++i; too < arr.length; too++) {
                    tooSum += arr[too];
                }
                if (oneSum == tooSum) {
                    break;
                } else {
                    oneSum = 0;
                    tooSum = 0;
                }
            }
            return true;
        }
        return false;
    }
    /*7. **** Написать метод, которому на вход подается одномерный массив
    и число n (может быть положительным, или отрицательным),
    при этом метод должен сместить все элементы массива на n позиций.
    Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
    вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
    при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.*/
    public static int[] moveElements(int[] arr, int n) {
        int k = n % arr.length + arr.length ;
        for (int i = 0; i < k ; i++) {
            int tmp = arr[arr.length - 1] ;
            for (int j = arr.length -1 ; j > 0 ; j++) {
                arr[j] = arr[j - 1];
            }
            arr[0] = tmp;
        }
        return arr ;
    }
}
