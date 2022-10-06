package homeWork4;

import java.util.Objects;

public abstract class Car {

    private int maxSpeed;
    private String model;

    public Car() {
    }

    public Car(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxSpeed, model);
    }

    public void gas() {
        System.out.println("Let's drive " + model);
    }

    public abstract void brake();
}
