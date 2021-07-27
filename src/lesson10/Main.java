package lesson10;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] words =
                {
                        "Аист", "Бегунчик", "Аист", "Иволга", "Крючкоклюв", "Бегунчик", "Медведка", "Аист", "Бегунчик", "Розелла",
                        "Аист", "Бабуин", "Бегунчик", "Воалаво", "Гнюс", "Иктитерия", "Бегунчик", "Аист", "Моа", "Бегунчик"
                };


        Set<String> setAnimals = new HashSet<>();
        setAnimals.addAll(Arrays.asList(words));

        List<String> listAnimals = new ArrayList<>();
        listAnimals.addAll(Arrays.asList(words) );

        Map<String, Integer> countRepeat = new HashMap<>();
        for (String x : listAnimals) {
            if (countRepeat.containsKey(x)) {
                countRepeat.put(x, countRepeat.get(x) + 1);
            } else {
                countRepeat.put(x, 1);
            }
        }

        System.out.println("Всего слов в массиве: "+words.length );
        System.out.println("Уникальных слов в массиве: "+setAnimals.toArray().length );
        System.out.println(countRepeat);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhone("Dmitriev","79000000010");
        phoneBook.addPhone("Ivanov","79000000010");
        phoneBook.addPhone("Petrov","79000000010");


        System.out.println("Dmitriev : " + phoneBook.getNumb("Dmitriev"));
        System.out.println("Ivanov : " + phoneBook.getNumb("Dmitriev"));
        System.out.println("Petrov : " + phoneBook.getNumb("Dmitriev"));

    }

}
