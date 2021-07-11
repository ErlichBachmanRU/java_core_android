package lesson6.Animals;

public class Cat extends Animals {
    protected int onlyRun;
    protected int onlySwim;
    protected static int countCats;

    public Cat(String name, String color, String run, String swim) {
        super(name, color, run, swim);
    }

    public Cat(String name, String color, String run, String swim, int onlyRun, int onlySwim) {
        super(name, color, run, swim);
        this.onlyRun = onlyRun;
        this.onlySwim = onlySwim;
        countCats++;
    }

    public static int howManyCats() {
        return countCats;
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
        System.out.printf("%s %s %s %d %s\n", name, "ни куда не поплывёт!", "Даже", distance / 100, "метров!Не умеет он плавать!");
    }
}
