package lesson10;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> phonebook = new HashMap<>();

    public void addNew(String name ,String tel){
        phonebook.putIfAbsent(name,tel);
    }

    public String getNum(String name){
        return phonebook.get(name);
    }
}
