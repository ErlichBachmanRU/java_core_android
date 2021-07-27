package lesson10;


import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> phoneBook = new HashMap<>();

    public void  addPhone(String name, String phone) {
        phoneBook.putIfAbsent(name,phone);
    }

    public String getNumb(String name){
        return phoneBook.get(name);
    }
}
