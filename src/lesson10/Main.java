package lesson10;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] arr = { "Федотов","Петухов","Ткаченко","Юдин","Федотов","Петухов",
                "Иванов","Беляев","Потапов","Беляев","Потапов","Зварыч","Бондаренко","Гусев"};

        Set<String> setArr = new HashSet<>();
        List<String> listArr = new ArrayList<>();
        Map<String, Integer> countRepeat = new HashMap<>();

        setArr.addAll(Arrays.asList(arr));
        listArr.addAll(Arrays.asList(arr));

        for (String x : listArr) {
            if (countRepeat.containsKey(x)) {
                countRepeat.put(x, countRepeat.get(x) + 1);
            } else {
                countRepeat.put(x, 1);
            }
        }

        PhoneBook book = new PhoneBook();
        book.addNew("Petrov","79170000001");
        book.addNew("Ivanov","79170000002");
        book.addNew("Sidorov","79170000003");




        System.out.println(listArr);
        System.out.println(setArr);
        System.out.println(countRepeat);
        System.out.println("Petrov:" + book.getNum("Petrov"));
    }

}
