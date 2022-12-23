import java.util.HashMap;
import java.util.Map;

public class Task3 {
    private final Map<String, Integer> map = new HashMap<>();

    public void addToMap(String key, int value) {
        if (!map.containsKey(key)) {
            map.put(key, value);
        } else {
            int valueFormMap = map.get(key);
            if (valueFormMap == value) {
                throw new IllegalArgumentException();
            } else {
                map.put(key, valueFormMap + value);
            }
        }
    }

    @Override
    public String toString() {
        return "Task3{" +
                "map=" + map +
                '}';
    }
}
