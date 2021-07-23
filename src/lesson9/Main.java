package lesson9;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[][] arr1 = new String[4][4];

        String[][] arr2 = {
                {"77", "55", "22"},
                {"23", "34", "45", "56"},
                {"78", "12", "34", "56"},
                {"23", "12", "11", "2"}
        };

        try {
            checkArr(arr2);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }


    }


    /**
     * Метод проверки массива на колличство строк и столбцов,преобразование элементов массива в int
     *
     * @param arr массив для проверки
     * @throws MyArraySizeException возникнет ошибка,если не допустимое колличество строк или столбцов
     *
     **/
    public static void checkArr(String[][] arr) throws MyArrayDataException {
        int a = 0;
        int b = 0;

        for (int i = 0; i < arr.length; i++) {
            a = arr[i].length;
            for (int j = 0; j < arr[i].length; j++) {
                b = arr[i].length;
                if (a != 4 || b != 4) {
                    throw new MyArraySizeException("Не допустимый размер массива.", arr);
                }
            }
        }
    }
}
