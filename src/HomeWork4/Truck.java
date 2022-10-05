package HomeWork4;

import java.util.Objects;

public class Truck extends Car implements Fuel {

    private int weight;
    private String type;

    public Truck() {
    }

    public Truck(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public Truck(int maxSpeed, String model, int weight, String type) {
        super(maxSpeed, model);
        this.weight = weight;
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void brake() {
        System.out.println(type + " -> Track brake");
    }

    public void trackOverviewModel() {
        System.out.println("This track model is: " + this.getModel());
    }

    @Override
    public void engine() {
        System.out.println("Track engine cannot be changed");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return weight == truck.weight && Objects.equals(type, truck.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight, type);
    }
}
