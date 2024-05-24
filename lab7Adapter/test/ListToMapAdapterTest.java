package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

import adapters.ListToMapAdapter;

public class ListToMapAdapterTest {

    @Test
    public void testSize() {
        List<String> list = new ArrayList<>();
        list.add("Teste 1");
        list.add("Teste 2");
        ListToMapAdapter<Integer, String> adapter = new ListToMapAdapter<>(list);
        assertEquals(2, adapter.size());
    }

    @Test
    public void testIsEmpty() {
        List<String> list = new ArrayList<>();
        ListToMapAdapter<Integer, String> adapter = new ListToMapAdapter<>(list);
        assertTrue(adapter.isEmpty());

        list.add("Teste");
        adapter = new ListToMapAdapter<>(list);
        assertFalse(adapter.isEmpty());
    }

    @Test
    public void testContainsKey() {
        List<String> list = new ArrayList<>();
        list.add("Teste 1");
        list.add("Teste 2");
        ListToMapAdapter<Integer, String> adapter = new ListToMapAdapter<>(list);
        assertTrue(adapter.containsKey(0));
        assertFalse(adapter.containsKey(2));
    }

    @Test
    public void testContainsValue() {
        List<String> list = new ArrayList<>();
        list.add("Teste 1");
        list.add("Teste 2");
        ListToMapAdapter<Integer, String> adapter = new ListToMapAdapter<>(list);
        assertTrue(adapter.containsValue("Teste 1"));
        assertFalse(adapter.containsValue("Teste 3"));
    }

    @Test
    public void testGet() {
        List<String> list = new ArrayList<>();
        list.add("Teste 1");
        list.add("Teste 2");
        ListToMapAdapter<Integer, String> adapter = new ListToMapAdapter<>(list);
        assertEquals("Teste 1", adapter.get(0));
        assertNull(adapter.get(2));
    }

    @Test
    public void testPut() {
        List<String> list = new ArrayList<>();
        list.add("Teste 1");
        list.add("Teste 2");
        ListToMapAdapter<Integer, String> adapter = new ListToMapAdapter<>(list);
        assertEquals("Teste 1", adapter.put(0, "Teste 3"));
        assertEquals("Teste 3", adapter.get(0));
        assertNull(adapter.put(2, "Teste 4"));
        assertEquals("Teste 4", adapter.get(2));
    }

    @Test
    public void testRemove() {
        List<String> list = new ArrayList<>();
        list.add("Teste 1");
        list.add("Teste 2");
        ListToMapAdapter<Integer, String> adapter = new ListToMapAdapter<>(list);
        assertEquals("Teste 1", adapter.remove(0));
        assertNull(adapter.remove(2));
    }

    @Test
    public void testClear() {
        List<String> list = new ArrayList<>();
        list.add("Teste 1");
        list.add("Teste 2");
        ListToMapAdapter<Integer, String> adapter = new ListToMapAdapter<>(list);
        adapter.clear();
        assertTrue(adapter.isEmpty());
    }

    @Test
    public void testKeySet() {
        List<String> list = new ArrayList<>();
        list.add("Teste 1");
        list.add("Teste 2");
        ListToMapAdapter<Integer, String> adapter = new ListToMapAdapter<>(list);
        Set<Integer> keys = adapter.keySet();
        assertTrue(keys.contains(0));
        assertTrue(keys.contains(1));
        assertFalse(keys.contains(2));
    }

    @Test
    public void testValues() {
        List<String> list = new ArrayList<>();
        list.add("Teste 1");
        list.add("Teste 2");
        ListToMapAdapter<Integer, String> adapter = new ListToMapAdapter<>(list);
        Collection<String> values = adapter.values();
        assertTrue(values.contains("Teste 1"));
        assertTrue(values.contains("Teste 2"));
    }

    @Test
    public void testEntrySet() {
        List<String> list = new ArrayList<>();
        list.add("Teste 1");
        list.add("Teste 2");
        ListToMapAdapter<Integer, String> adapter = new ListToMapAdapter<>(list);
        Set<Map.Entry<Integer, String>> entries = adapter.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            assertEquals(list.get(entry.getKey()), entry.getValue());
        }
    }

    @Test
    public void testToString() {
        List<String> list = new ArrayList<>();
        list.add("Teste 1");
        list.add("Teste 2");
        ListToMapAdapter<Integer, String> adapter = new ListToMapAdapter<>(list);
        assertEquals(list.toString(), adapter.toString());
    }
}