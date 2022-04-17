package by.zimin.task.one;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String name;
    private String model;
    private int engineCapacity;
    private TypeEngine typeEngine;

    public Car(String name, String model, int engineCapacity, TypeEngine typeEngine) {
        this.name = name;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.typeEngine = typeEngine;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public TypeEngine getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(TypeEngine typeEngine) {
        this.typeEngine = typeEngine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return engineCapacity == car.engineCapacity && Objects.equals(name, car.name) && Objects.equals(model, car.model) && typeEngine == car.typeEngine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, engineCapacity, typeEngine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", typeEngine=" + typeEngine +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        int result = 0;
        if (o.getClass() == getClass() && o != null) {
            Car b = this;
            if (o.getEngineCapacity() == b.getEngineCapacity()) {
                return 0;
            } else {
                result = o.getEngineCapacity() - b.getEngineCapacity();
            }
        }
        return result;
    }
}
