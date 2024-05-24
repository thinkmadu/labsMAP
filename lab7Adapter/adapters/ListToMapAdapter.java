package adapters;
import java.util.*;

public class ListToMapAdapter<K, V> implements Map<K, V> {
    private final List<V> list;

    public ListToMapAdapter(List<V> list) {
        this.list = list;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        if (key instanceof Integer) {
            int index = (Integer) key;
            return index >= 0 && index < list.size();
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return list.contains(value);
    }

    @Override
    public V get(Object key) {
        if (key instanceof Integer) {
            int index = (Integer) key;
            if (index >= 0 && index < list.size()) {
                return list.get(index);
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        if (key instanceof Integer) {
            int index = (Integer) key;
            if (index >= 0 && index < list.size()) {
                return list.set(index, value);
            } else if (index == list.size()) {
                list.add(value);
                return null;
            }
        }
        throw new IllegalArgumentException("Key must be an integer within the bounds of the list");
    }

    @Override
    public V remove(Object key) {
        if (key instanceof Integer) {
            int index = (Integer) key;
            if (index >= 0 && index < list.size()) {
                return list.remove(index);
            }
        }
        return null;
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public Set<K> keySet() {
        Set<K> keys = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            keys.add((K) Integer.valueOf(i));
        }
        return keys;
    }

    @Override
    public Collection<V> values() {
        return list;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> entries = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            final int index = i;
            entries.add(new Entry<K, V>() {
                @Override
                public K getKey() {
                    return (K) Integer.valueOf(index);
                }

                @Override
                public V getValue() {
                    return list.get(index);
                }

                @Override
                public V setValue(V value) {
                    return list.set(index, value);
                }
            });
        }
        return entries;
    }

    @Override
    public String toString() {
        return list.toString();
    }

    // Métodos não implementados ou não aplicáveis
    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        throw new UnsupportedOperationException("putAll not supported");
    }
}
