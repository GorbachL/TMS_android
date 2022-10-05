package HomeWork4;

public interface Fuel {
    void engine();

    default void changeType() {
        System.out.println("Try changing engine type");
    }
}
