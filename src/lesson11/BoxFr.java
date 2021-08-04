package lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxFr<T extends Fruit> {
    private List<T> box;

    public BoxFr() {
        this.box = new ArrayList<>();

    }

    public BoxFr(T... fruits) {
        this.box = new ArrayList<>(Arrays.asList(fruits));

    }

    public float getVes() {
        float v = 0.0f;
        for (T fruit : box) {
            v += fruit.getVes();
        }
        return v;
    }

    public boolean sameAvg(BoxFr<?> n) {
        return Math.abs(this.getVes() - n.getVes()) < 0.001;
    }

    public void replace(BoxFr<? super T> n) {
        if (n == this) {
            return;
        }
        n.box.addAll(this.box);
        this.box.clear();
    }

    public void add(T fruit) {
        box.add(fruit);
    }

}
