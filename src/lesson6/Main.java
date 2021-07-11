package lesson6;

import lesson6.Animals.*;

public class Main {
    public static void main(String[] args) {

        Cat barsik = new Cat("Барсик", "Белый", "бегать", "плавать", 200, 0);
        Cat pooshock = new Cat("Пушок", "Серый", "бегать", "плавать", 100, 0);
        Dog bobik = new Dog("Бобик", "чёрный", "бегать", "плавать", 500, 10);

        int animCout = 0;

        barsik.info();
        barsik.canRun(500);
        barsik.canSwim(500);
        System.out.println("");

        pooshock.info();
        pooshock.canRun(500);
        pooshock.canSwim(500);
        System.out.println("");

        bobik.info();
        bobik.canRun(1000);
        bobik.canSwim(1000);
        System.out.println("");

        System.out.printf("%s %d %s\n", "Создали", Cat.howManyCats(), "кошка.");
        System.out.printf("%s %d %s\n", "Создали", Dog.howManyDogs(), "собака.");
        System.out.printf("%s %d %s\n", "Создали", Cat.howManyCats()+Dog.howManyDogs(), "животных.");
        //   Else
        System.out.printf("%s %d %s", "Создали", Animals.howManyAnimals(), "животных.");

    }
}
