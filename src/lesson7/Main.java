package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("barsik", false, 15),
                new Cat("murzik", false, 25)
        };
        Plate miska = new Plate(15);
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
            System.out.println(miska);
            cats[i].eat(miska);
            System.out.println(cats[i]);
        }

    }
}
