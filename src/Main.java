import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        goStringDu();
        goPhoneBook();



    }

    private static void goPhoneBook() {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Пушкин", "555");
        phonebook.add("Тютчев", "100");
        phonebook.add("Толстой", "777");
        phonebook.add("Иванов", "111");
        phonebook.add("Пушкин", "333");

        System.out.println(phonebook.get("Пушкин"));
        System.out.println(phonebook.get("Иванов"));

    }

    private static void goStringDu() {
        String[] strings = {"Машина", "Пылесос", "Телевизор", "Камод", "Телефон", "Машина",
                "Пылесос", "Телевизор", "Кот", "Собака"};
        Map<String,Integer> map = new HashMap<>();
        for (String string : strings){
            map.put(string,map.getOrDefault(string,0)+1);
        }
        System.out.println(map.keySet());
        System.out.println(map);
    }

}
