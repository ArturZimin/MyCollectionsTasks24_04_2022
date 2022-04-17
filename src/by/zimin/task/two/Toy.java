package by.zimin.task.two;

import java.time.LocalDate;
import java.util.Objects;

public class Toy {
    private String name;
    private LocalDate dateOfManufacture;

    public Toy(String name, LocalDate dateOfManufacture) {
        this.name = name;
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return Objects.equals(name, toy.name) && Objects.equals(dateOfManufacture, toy.dateOfManufacture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfManufacture);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                '}';
    }
}
