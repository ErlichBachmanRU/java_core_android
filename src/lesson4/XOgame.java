package lesson4;

import java.util.Random;
import java.util.Scanner;

public class XOgame {
    static final Scanner sc = new Scanner(System.in);
    static final Random rand = new Random();

    static final int SIZE = 3;
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char EMPTY = '.';
    static char[][] map;

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            hum();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Крестики победили!!!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Нолики победили!!!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }


    static public void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = EMPTY;
            }
        }
    }

    static public void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d ", i + 1);

        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d ", i + 1);
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%c ", map[i][j]);
            }
            System.out.println();
        }
    }

    public static void hum() {
        int x;
        int y;

        do {
            System.out.println("Ход по координатам ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;

    }

    public static void aiTurn() {
        int x ;
        int y ;
        do {
            y = rand.nextInt(SIZE);
            x = rand.nextInt(SIZE);
        } while (!isCellValid(y, x));

        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int y, int x) {
        if (y < 0 || x < 0 || y >= SIZE || x >= SIZE) {
            return false;
        }
        return map[y][x] == EMPTY;
    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    // Определяем кто победил ...
    public static boolean checkWin(char hooWin) {
        int win_i = 0;
        int win_j = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                win_i += map[i][j];
                win_j += map[j][i];
                /*Проверяем на победу в колонках и рядах */
                if (win_i == SIZE*hooWin || win_j == SIZE*hooWin) {
                    return true;
                }
            }
        }

        return false;
    }


}
