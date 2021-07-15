package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik");
        Plate miska = new Plate(100);

        barsik.eat(miska);
        System.out.println(miska);
    }
}
