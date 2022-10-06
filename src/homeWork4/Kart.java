package homeWork4;

import java.util.Objects;

public class Kart extends Car implements Fuel {

    private int numberOfPassenger;
    private String mark;

    public Kart() {
    }

    public Kart(int numberOfPassenger, String mark) {
        this.numberOfPassenger = numberOfPassenger;
        this.mark = mark;
    }

    public Kart(int maxSpeed, String model, int numberOfPassenger, String mark) {
        super(maxSpeed, model);
        this.numberOfPassenger = numberOfPassenger;
        this.mark = mark;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public void brake() {
        System.out.println(mark + " -> Kart STOP");
    }

    public void beforeStart() {
        if (numberOfPassenger < 2) {
            gas();
        } else {
            getStop();
            brake();
        }
    }

    private void getStop() {
        System.out.println("Too many passengers..");
    }

    @Override
    public void engine() {
        System.out.println("ONLY GAS");
    }

    @Override
    public String toString() {
        return "Kart{" +
                "numberOfPassenger=" + numberOfPassenger +
                ", mark='" + mark + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Kart kart = (Kart) o;
        return numberOfPassenger == kart.numberOfPassenger && Objects.equals(mark, kart.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfPassenger, mark);
    }
}
