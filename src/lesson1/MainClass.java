package lesson1;

import java.util.Calendar;

/*1. Создать пустой проект в IntelliJ IDEA и прописать метод main().*/
public class MainClass {
    public static void main(String[] args) {
        /*2*/
        System.out.println("   Задание 2е :");
        javaDataType();

        /*3*/
        System.out.println("   Задание 3е :");
        System.out.println(simplMath(2, 2, 2, 2));

        /*4*/
        System.out.println("   Задание 4е :");
        System.out.println(checkSumm(7, 2));

        /*5*/
        System.out.println("   Задание 5е :");
        checkNumb(-1);

        /*6*/
        System.out.println("   Задание 6е :");
        System.out.println(checkNumb2(-2));

        /*7*/
        System.out.println("   Задание 7е :");
        hiYourself("Александр");

        /*8*/
        System.out.println("   Задание 8е :");
        visak(2021);

    }
    /*2. Создать переменные всех пройденных типов данных и инициализировать их значения.*/
    public static void javaDataType() {

        /*Целочисленные типы данных*/
        /*целое число , 1 байт , диапозон значений от -128 до 127 */
        byte byteType = 127;

        /*целое число , 2 байта , диапазон значений от -32768 до 32767 */
        short shortType = 32767 / 127;

        /*целое число , 4 байта , диапазон значений от -2147483648 до 2147483647 */
        int intType = -2147483648 - 1;

        /*целое число , 8 байт , диапазон значений от -9223372036854775808 до 9223372036854775807 */
        long longType = -9223372036854775808L - 1;

        /*вещественные типы данных*/
        // числа с плавающей точкой , 32 бита , диапазон значений от ~1,4*10в стпени45 до ~3,4*10в стпени38
        float floatType = 3.14159265358979323846F;
        // числа с плавающей точкой , 64 бита , диапазон значений от ~4,9*10в стпени324  до ~1,8*10в стпени308
        double doubleType = 3.14159265358979323846D;

        /*Character символьный тип данных представляет собой один 16-битный Unicode символ.
        Он имеет минимальное значение ‘\u0000’ (или 0), и максимальное значение ‘\uffff’ (или 65535 включительно).*/
        char charType = '\u2021';

        /*boolean — предназначен для хранения логических значений.
        Переменные этого типа могут принимать только одно из 2х возможных значений
        true или false.*/
        int Year = Calendar.getInstance().get(Calendar.YEAR);
        boolean BoolWhenI = Year == 2021;

        /*Тип String не является примитивным типом данных,
        String  предназначен для хранения строк текста.*/
        String InterestingFact = "\n Если присвоить переменной char 2021 по unicode (u2021) \n " +
                "(ну т.е. текущий год.) То выводится символ 'double dagger' \n" +
                " или Двойной дэггер, Даблдэггер, Двойной крест (Double Dagger). \n" +
                " Это из шрифтовой терминологии,один из знаков сноски, \n " +
                "применяемый в Англии и Америке.(По информации из Гугла)";

        System.out.println("byteType: " + byteType);
        System.out.println("shortType: " + shortType);
        System.out.println("intType: " + intType);
        System.out.println("longType: " + longType);
        System.out.println("floatType: " + floatType);
        System.out.println("doubleType: " + doubleType);
        System.out.println("charType: " + charType);
        System.out.println("boolean: " + BoolWhenI);
        System.out.println("InterestingFact: " + InterestingFact);
    }

    /*3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – аргументы этого метода, имеющие тип float.*/
    public static float simplMath(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    /*4. Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.*/
    public static boolean checkSumm(long a, long b) {
        long summAB = a + b;
        if (summAB < 10 || summAB > 20) {
            return false;
        } else {
            return true;
        }
    }
    // Лучше если так: без if , через return
    public static boolean checkSummr(long a, long b) {
        return ( a+b>=10 ) && ( a+b<=20 );
    }

    /*5. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.*/
    public static void checkNumb(long addNumb) {
        if (addNumb < 0) {
            System.out.println("Это отрицательное число!");
        } else {
            System.out.println("Это положительное число!");
        }
    }

    /*6. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное,
    и вернуть false если положительное.*/
    public static boolean checkNumb2(long addNumb2) {
        if (addNumb2 < 0) {
            return true;
        } else {
            return false;
        }
    }
    // Лучше если так:
    public static boolean checkNumbr(int n) {
       return n < 0 ;
    }

    /*7.Написать метод, которому в качестве параметра передается строка,
    обозначающая имя.Метод должен вывести в консоль сообщение «Привет, указанное_имя!».*/
    public static void hiYourself(String yourName) {
        System.out.println("Привет," + yourName + "!");
        //Вариант с printf
        System.out.printf("Привет, %s !\n", yourName );
    }

    /*8. *Написать метод, который определяет, является ли год високосным,
     и выводит сообщение в консоль.
     Каждый 4-й год является високосным,
     кроме каждого 100-го,
     при этом каждый 400-й – високосный.*/
    public static void visak(int yer) {
        if ((yer % 100 > 0) && (yer % 4 == 0)) {
            System.out.println("Это високосный год!");
        } else if (yer % 400 == 0) {
            System.out.println("Это високосный год!");
        } else {
            System.out.println("Это НЕ високосный год!");
        }
    }
    //Лучше так,более локанично
    public static void nevisak(int yer) {
        if (yer % 4 == 0 && yer % 100 !=0 || yer % 400 ==0) {
            System.out.println("Это високосный год!");
        } else {
            System.out.println("Это НЕ високосный год!");
        }
    }

}
