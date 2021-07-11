package lesson6.Animals;

public class Animals {
    protected String name;
    protected String color;
    protected String run;
    protected String swim;
    private static int countAnimals;


    public Animals(String name, String color, String run, String swim) {
        this.name = name;
        this.color = color;
        this.run = run;
        this.swim = swim;
        countAnimals++;
    }

    public void info() {
        System.out.printf("%s %s\n", name, color);

    }

    public void canSwim(int distance) {
        System.out.printf("%s %s %d %s\n", name, "проплыл", distance, "метров");
    }

    public void canRun(int distance) {
        System.out.printf("%s %s %d %s\n", name, "пробежал", distance, "метров");
    }

    public static int howManyAnimals() {
        return countAnimals;
    }

}

