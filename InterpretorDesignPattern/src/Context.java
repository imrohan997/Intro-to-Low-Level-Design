import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String, Integer> context = new HashMap<>();

    public void put(String key, int value) {
        context.put(key, value);
    }

    public int get(String key) {
        return context.get(key);
    }
}
