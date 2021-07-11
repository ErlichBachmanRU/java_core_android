package lesson6.Animals;

public class Dog extends Animals {
    protected int onlyRun;
    protected int onlySwim;
    protected static int countDogs;

    public Dog(String name, String color, String run, String swim) {
        super(name, color, run, swim);
    }

    public Dog(String name, String color, String run, String swim, int onlyRun, int onlySwim) {
        super(name, color, run, swim);
        this.onlyRun = onlyRun;
        this.onlySwim = onlySwim;
        countDogs++ ;
    }

    public static int howManyDogs() {
        return countDogs;
    }

    @Override
    public void canRun(int distance) {
        if (distance > onlyRun) {
            System.out.printf("%s %s %d %s\n", name, "может бегать на", onlyRun, "метров");
            System.out.printf("%s %s %d %s %d\n", name, "пробежал", onlyRun, "метров,осталось", distance - onlyRun);
        } else {
            super.canRun(distance);
        }

    }

    @Override
    public void canSwim(int distance) {
        if (distance > onlySwim) {
            System.out.printf("%s %s %d %s\n", name, "может плавать на", onlySwim, "метров");
            System.out.printf("%s %s %d %s %d\n", name, "проплыл уже", onlySwim, "метров,осталось", distance - onlySwim);
        } else {
            System.out.printf("%s %s %d %s\n", name, "проплыл", distance, "метров");
        }
    }
}
