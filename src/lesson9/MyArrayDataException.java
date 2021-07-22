package lesson9;

public class MyArrayDataException extends RuntimeException {
    private String[][] arr;

    public MyArrayDataException(String message, String[][] arr) {
        super(message);
        this.arr = arr;
    }

    public String[][] getArr() {
        return arr;
    }




}
