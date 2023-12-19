import java.util.HashMap;
import java.util.Map;
import java.util.Set;

interface MySet<T> {
    void add(T element);
    void remove(T element);
    boolean contains(T element);
    int size();
}

class HashMapSet<T> implements MySet<T> {
    private final Map<T, Object> map;

    public HashMapSet() {
        this.map = new HashMap<>();
    }

    @Override
    public void add(T element) {
        map.put(element, new Object());
    }

    @Override
    public void remove(T element) {
        map.remove(element);
    }

    @Override
    public boolean contains(T element) {
        return map.containsKey(element);
    }

    @Override
    public int size() {
        return map.size();
    }
}


