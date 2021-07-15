package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decrease(int amount) {
        food -= amount;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
