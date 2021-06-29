package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main3 {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    static String username = System.getProperty("user.name");

    public static void main(String[] args) {
        RandNumb(10);

    }

    /*Приветсвие игрока.*/
    public static void HelloUser(String namePlayer) {
        System.out.printf("Привет, %s ! Давайте поиграем. Java загодало число от 0 до 9,\n " +
                "попробуйте угадать.У вас три попытки!Удачи, %s ! \n ", namePlayer, namePlayer);
    }

    /*Сообщаем больше/меньше.*/
    public static void message(int scInt, int randomInt) {
        String messge;
        if (scInt > randomInt) {
            messge = "загаданное число меньше!";
        } else if (scInt < randomInt) {
            messge = "загаданное число больше!";
        } else {
            messge = "вы угадали!";
        }
        System.out.printf("%s %s %s", username, ",", messge);
    }

    public static void loop(int count) {
        if (count-1 == 0) {
            System.out.printf("%10s %s", " GAME OVER","Использованы все поппытки");
            System.out.printf("%10s", "\n Повторить игру еще раз? 1 – да / 0 – нет ?");
        }
    }


    public static void RandNumb(int rang) {
        HelloUser(username);
        int randNumb = rand.nextInt(rang);
        int count = 3;
        for (int i = 0; i < count; count--) {
            int roundFight = sc.nextInt();
            if (count != 0 && randNumb != roundFight) {
//                System.out.println(randNumb);
                message(roundFight, randNumb);
                loop(count);
            } else {
                message(roundFight, randNumb);
                System.out.printf("%10s", "\n Повторить игру еще раз? 1 – да / 0 – нет ?");
                break;
            }
        }
    }
}
