import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Phonebook {
    private Map<String, Set<String>> map;

    public Phonebook() {
        this.map = new HashMap<>();
    }

    public void add(String surname, String phoneNumber){
        Set<String> maps = map.getOrDefault(surname, new HashSet<>());
        maps.add(phoneNumber);
        map.put(surname, maps);

    }

    public Set<String> get(String surname){
        return map.get(surname);
    }

}
