import java.util.*;

import adapters.ListToMapAdapter;
import adapters.MapToListAdapter;

public class Client {
    public static void main(String[] args) {
        // Criação de uma lista e seu adaptador
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Map<Integer, String> listAsMap = new ListToMapAdapter<>(list);

        // Manipulação usando métodos da interface Map
        System.out.println("Manipulando List como Map:");
        System.out.println("Tamanho: " + listAsMap.size());
        System.out.println("Contém chave 1: " + listAsMap.containsKey(1));
        System.out.println("Contém valor 'B': " + listAsMap.containsValue("B"));
        System.out.println("Valor na chave 1: " + listAsMap.get(1));

        listAsMap.put(1, "Z");
        System.out.println("Novo valor na chave 1: " + listAsMap.get(1));

        listAsMap.remove(2);
        System.out.println("Lista após remoção: " + listAsMap.values());

        listAsMap.clear();
        System.out.println("Lista após limpar: " + listAsMap.values());
        System.out.println("-".repeat(25));

        // Criação de um mapa e seu adaptador
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "X");
        map.put(1, "Y");
        map.put(2, "Z");

        List<String> mapAsList = new MapToListAdapter<>(map);

        // Manipulação usando métodos da interface List
        System.out.println("\nManipulando Map como List:");
        System.out.println("Tamanho: " + mapAsList.size());
        System.out.println("Contém 'Y': " + mapAsList.contains("Y"));
        System.out.println("Valor no índice 1: " + mapAsList.get(1));

        mapAsList.add("A");
        System.out.println("Lista após adicionar 'A': " + mapAsList);

        mapAsList.remove("X");
        System.out.println("Lista após remover 'X': " + mapAsList);

        mapAsList.clear();
        System.out.println("Lista após limpar: " + mapAsList);
        System.out.println("-".repeat(25));
    }
}
