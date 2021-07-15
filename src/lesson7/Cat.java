package lesson7;

public class Cat {
    private String name;
    private boolean notHunger = false;
    private int indexHunger = 15;

    public Cat(String name, boolean notHunger, int indexHunger) {
        this.name = name;
        this.notHunger = notHunger;
        this.indexHunger = indexHunger;
    }

    public String getName() {
        return name;
    }

    public int getIndexHunger() {
        return indexHunger;
    }



    public boolean isNotHunger() {
        return notHunger;
    }



    @Override
    public String toString() {
        if (notHunger) {
            return "Это кот " + name + ",и сейчас сыт!";
        } else {
            return name+" голоден,нужно покормить!";
        }

    }

    public void eat(Plate plate) {
        if(plate.getFood() >= indexHunger) {
            System.out.println("кот " + name + " ест...");
            plate.decrease(this.indexHunger);
            notHunger = true;
        } else {
            System.out.println("В миске мало еды. " + name + " ест " + indexHunger + " кусочков за раз!");
        }
    }
}
