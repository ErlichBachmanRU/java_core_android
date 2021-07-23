package lesson9;

public class MyArraySizeException extends RuntimeException {
    private String[][] arr;

    public MyArraySizeException(String s, String[][] arr) {
        super(s);
        this.arr = arr;
    }

    public String[][] getArr() {
        return arr;
    }
}
