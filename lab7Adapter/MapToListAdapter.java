import java.util.*;

public class MapToListAdapter<E> implements List<E> {
    private final Map<Integer, E> map;

    public MapToListAdapter(Map<Integer, E> map) {
        this.map = map;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsValue(o);
    }

    @Override
    public Iterator<E> iterator() {
        return map.values().iterator();
    }

    @Override
    public Object[] toArray() {
        return map.values().toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return map.values().toArray(a);
    }

    @Override
    public boolean add(E e) {
        map.put(map.size(), e);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Integer keyToRemove = null;
        for (Map.Entry<Integer, E> entry : map.entrySet()) {
            if (entry.getValue().equals(o)) {
                keyToRemove = entry.getKey();
                break;
            }
        }
        if (keyToRemove != null) {
            map.remove(keyToRemove);
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return map.values().containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        int size = map.size();
        for (E e : c) {
            map.put(size++, e);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("addAll at index not supported");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object e : c) {
            modified |= remove(e);
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean modified = false;
        Iterator<E> it = map.values().iterator();
        while (it.hasNext()) {
            if (!c.contains(it.next())) {
                it.remove();
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public E get(int index) {
        return map.get(index);
    }

    @Override
    public E set(int index, E element) {
        return map.put(index, element);
    }

    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException("add at index not supported");
    }

    @Override
    public E remove(int index) {
        return map.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        for (Map.Entry<Integer, E> entry : map.entrySet()) {
            if (entry.getValue().equals(o)) {
                return entry.getKey();
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("lastIndexOf not supported");
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException("listIterator not supported");
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("listIterator at index not supported");
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("subList not supported");
    }

    @Override
    public String toString() {
        return map.values().toString();
    }
}
