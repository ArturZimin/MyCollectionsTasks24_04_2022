package by.zimin.task.two;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparator<Product> {
    private String name;
    private Toy toy;

    public Product(String name, Toy toy) {
        this.name = name;
        this.toy = toy;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Toy getToy() {
        return toy;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    @Override
    public int compare(Product o1, Product o2) {
        int result = 0;
        if (o1.getClass() == getClass() && o2.getClass() == getClass() && o1 != null && o2 != null) {
            result = o1.getName().compareTo(o2.getName());
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(toy, product.toy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, toy);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", toy=" + toy +
                '}';
    }
}
