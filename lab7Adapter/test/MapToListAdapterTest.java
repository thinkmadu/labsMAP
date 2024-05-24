package test;


import org.junit.jupiter.api.Test;

import adapters.MapToListAdapter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class MapToListAdapterTest {

    @Test
    public void testAdd() {
        Map<Integer, String> map = new HashMap<>();
        MapToListAdapter<String> adapter = new MapToListAdapter<>(map);
        assertTrue(adapter.add("zero"));
        assertEquals(1, adapter.size());
        assertTrue(adapter.contains("zero"));
    }

    @Test
    public void testRemove() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "zero");
        MapToListAdapter<String> adapter = new MapToListAdapter<>(map);
        assertTrue(adapter.remove("zero"));
        assertFalse(adapter.contains("zero"));
    }

    @Test
    public void testContainsAll() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "zero");
        map.put(1, "one");
        MapToListAdapter<String> adapter = new MapToListAdapter<>(map);
        assertTrue(adapter.containsAll(Arrays.asList("zero", "one")));
    }

    @Test
    public void testAddAll() {
        Map<Integer, String> map = new HashMap<>();
        MapToListAdapter<String> adapter = new MapToListAdapter<>(map);
        assertTrue(adapter.addAll(Arrays.asList("zero", "one")));
        assertEquals(2, adapter.size());
    }

    @Test
    public void testRemoveAll() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "zero");
        map.put(1, "one");
        MapToListAdapter<String> adapter = new MapToListAdapter<>(map);
        assertTrue(adapter.removeAll(Arrays.asList("zero", "one")));
        assertEquals(0, adapter.size());
    }

    @Test
    public void testRetainAll() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "zero");
        map.put(1, "one");
        MapToListAdapter<String> adapter = new MapToListAdapter<>(map);
        assertTrue(adapter.retainAll(Arrays.asList("zero")));
        assertEquals(1, adapter.size());
        assertTrue(adapter.contains("zero"));
    }

    @Test
    public void testClear() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "zero");
        map.put(1, "one");
        MapToListAdapter<String> adapter = new MapToListAdapter<>(map);
        adapter.clear();
        assertEquals(0, adapter.size());
    }

    @Test
    public void testSize() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "zero");
        map.put(1, "one");
        MapToListAdapter<String> adapter = new MapToListAdapter<>(map);
        assertEquals(2, adapter.size());
    }

    @Test
    public void testIsEmpty() {
        Map<Integer, String> map = new HashMap<>();
        MapToListAdapter<String> adapter = new MapToListAdapter<>(map);
        assertTrue(adapter.isEmpty());
    }

    @Test
    public void testContains() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "zero");
        MapToListAdapter<String> adapter = new MapToListAdapter<>(map);
        assertTrue(adapter.contains("zero"));
        assertFalse(adapter.contains("one"));
    }
    @Test
    public void testListIterator() {
        Map<Integer, String> map = new HashMap<>();
        MapToListAdapter<String> adapter = new MapToListAdapter<>(map);
        assertThrows(UnsupportedOperationException.class, () -> adapter.listIterator(0));
    }

    @Test
    public void testSubList() {
        Map<Integer, String> map = new HashMap<>();
        MapToListAdapter<String> adapter = new MapToListAdapter<>(map);
        assertThrows(UnsupportedOperationException.class, () -> adapter.subList(0, 1));
    }

    @Test
    public void testToString() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "zero");
        map.put(1, "one");
        MapToListAdapter<String> adapter = new MapToListAdapter<>(map);
        assertEquals("[zero, one]", adapter.toString());
    }
    
    @Test
    public void testRemoveIndex() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "zero");
        MapToListAdapter<String> adapter = new MapToListAdapter<>(map);
        assertEquals("zero", adapter.remove(0));
        assertFalse(adapter.contains("zero"));
    }

    @Test
    public void testIndexOf() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "zero");
        MapToListAdapter<String> adapter = new MapToListAdapter<>(map);
        assertEquals(0, adapter.indexOf("zero"));
    }
}

    


