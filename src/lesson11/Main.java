package lesson11;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] strArr = {"raz", "dva", "tri"};
        Integer[] intArr = {1, 2, 3,4,5};

        System.out.println(changeArr(strArr));
        replIndex(intArr,0,2);
        replInd(intArr,1,4);
        System.out.println(Arrays.asList(intArr));


    }

    public static <T>ArrayList<T> changeArr(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static void replIndex(Object[] arr, int ind1,int ind2){
        Object x = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = x ;
    }

    public static <T> void replInd(T[] arr, int ind1,int ind2){
        T x = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = x ;
    }
}
