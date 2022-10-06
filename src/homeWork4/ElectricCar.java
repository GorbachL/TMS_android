package homeWork4;

import java.util.Objects;

public class ElectricCar extends Car implements Fuel {

    private int numberOfBatteries;
    private int capacity;

    public ElectricCar() {
    }

    public ElectricCar(int numberOfBatteries, int capacity) {
        this.numberOfBatteries = numberOfBatteries;
        this.capacity = capacity;
    }

    public ElectricCar(int maxSpeed, String model, int numberOfBatteries, int capacity) {
        super(maxSpeed, model);
        this.numberOfBatteries = numberOfBatteries;
        this.capacity = capacity;
    }

    public int getNumberOfBatteries() {
        return numberOfBatteries;
    }

    public void setNumberOfBatteries(int numberOfBatteries) {
        this.numberOfBatteries = numberOfBatteries;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void brake() {
        System.out.println("STOP the Electric Car");
    }

    public void go() {
        System.out.println("Electric Car starts moving");
    }

    @Override
    public void gas() {
        System.out.println("NO GAS");
    }

    @Override
    public void engine() {
        System.out.println("Battery capacity is " + capacity);
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "numberOfBatteries=" + numberOfBatteries +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ElectricCar that = (ElectricCar) o;
        return numberOfBatteries == that.numberOfBatteries && capacity == that.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfBatteries, capacity);
    }
}
