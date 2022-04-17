package by.zimin.task.one;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TaskOne {

    /**
     * 0 Напишите Java-программу для итерации объекта типа HashMap с использованием
     * цикла while и улучшенного цикла for.
     *
     * @param args
     */
    public static void main(String[] args) {
        Map<Car, Integer> carCost = new HashMap();

        Car car1 = new Car("Audi", "A2", 1600, TypeEngine.BENZINE);
        Car car2 = new Car("Volkswagen", "Bora", 1200, TypeEngine.GAS);
        Car car3 = new Car("Mercedes-benz", "GL400", 2600, TypeEngine.BENZINE);
        Car car4 = new Car("Ford", "Galaxy", 2300, TypeEngine.DIESEL);

        carCost.put(car1, 7000);
        carCost.put(car2, 8000);
        carCost.put(car3, 12000);
        carCost.put(car4, 9000);

        Iterator iterator = carCost.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()+" price ");
        }
        System.out.println("--------------------------------------------");
        for (Map.Entry<Car, Integer> m : carCost.entrySet()) {
            System.out.println(m.getKey() + " = " + m.getValue()+" price ");
        }

    }
}
