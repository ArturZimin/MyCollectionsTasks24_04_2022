package by.zimin.task.two;

import java.time.LocalDate;
import java.util.*;

import static java.util.List.of;

public class Test {

    /**
     * 1 Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product).
     * Перебрать и распечатать пары значений - entrySet().
     * Перебрать и распечатать набор из имен продуктов  - keySet().
     * Перебрать и распечатать значения продуктов - values().
     * Для каждого перебора создать свой метод.
     *
     * @param args
     */
    public static Map<Toy, Integer> mapCountAsortiment = new HashMap<>(10);

    public static void main(String[] args) {

        Toy toy = new Toy("Tiger", LocalDate.of(2000, 06, 30));
        Toy toy2 = new Toy("Lion", LocalDate.of(2015, 04, 30));
        Toy toy3 = new Toy("Jaguar", LocalDate.of(2019, 05, 31));
        Toy toy4 = new Toy("Cat", LocalDate.of(2020, 02, 28));
        Toy toy5 = new Toy("Dog", LocalDate.of(2010, 07, 30));
        mapCountAsortiment.put(toy, 345);
        mapCountAsortiment.put(toy2, 200);
        mapCountAsortiment.put(toy3, 150);
        mapCountAsortiment.put(toy4, 176);
        mapCountAsortiment.put(toy5, 305);

        parseWithHelpEntrySet(mapCountAsortiment);
        System.out.println("--------------------------------------------");
        parseWithHelpKeySet(mapCountAsortiment);
        System.out.println("--------------------------------------------");

        parseWithHelpValues(mapCountAsortiment);

    }

    public static void parseWithHelpEntrySet(Map<Toy, Integer> map) {
        for (Map.Entry<Toy, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + " = " + m.getValue());
        }
    }

    public static void parseWithHelpKeySet(Map<Toy, Integer> map) {
        Set<Toy> keySet = map.keySet();
        keySet.stream()
                .sorted(new Comparator<Toy>() {
                    @Override
                    public int compare(Toy o1, Toy o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                })
                .forEach(x -> System.out.println(x));
    }

    public static void parseWithHelpValues(Map<Toy, Integer> map) {
        Collection<Integer> value = map.values();
        value.stream()
                .sorted()
                .forEach(x -> System.out.println(x));
    }
}
