package homeWork4;

public class CarApp {

    public static void main(String[] args) {
        //TRUCK
        Truck truck = new Truck(300, "trackTYU", 20, "old Track");
        Truck truck1 = new Truck();
        Truck truck2 = new Truck(300, "trackTYU", 20, "old Track");
        Truck truck3 = new Truck(400, "new new Track");
        int w = 300;
        truck1.setWeight(w);

        System.out.println(truck); //Truck{weight=20, type='old Track'}
        System.out.println(truck1); //Truck{weight=300, type='null'}
        System.out.println(truck2); //Truck{weight=20, type='old Track'}
        System.out.println(truck.equals(truck2)); //true
        System.out.println(truck3); //Truck{weight=400, type='new new Track'}
        System.out.println("model: " + truck.getModel() + " speed: " + truck.getMaxSpeed());// model: trackTYU speed: 300

        truck.trackOverviewModel(); //This track model is: trackTYU
        truck.gas(); //Let's drive trackTYU
        truck.brake(); //old Track -> Track brake
        truck.engine(); //Track engine cannot be changed

        int weightTrack = 1000;
        String newType = "Track QAZ";
        truck2.setType(newType);
        truck2.setWeight(weightTrack);
        System.out.println(truck2); //Truck{weight=1000, type='Track QAZ'}
        System.out.println(truck2.equals(truck)); //false

        //KART
        int passenger = 3;
        Kart kart = new Kart(500, "V Kart", passenger, "Kart 1");
        kart.gas(); //Let's drive V Kart
        kart.beforeStart(); // Too many passengers.. //Kart 1 -> Kart STOP
        kart.brake(); //Kart 1 -> Kart STOP
        kart.engine(); //ONLY GAS

        //ELECTRONIC CAR
        ElectricCar electricCar = new ElectricCar();
        electricCar.go(); //Electric Car starts moving
        electricCar.gas(); //NO GAS
        electricCar.brake(); //STOP the Electric Car
        electricCar.engine(); //Battery capacity is 0
        int b = 800;
        electricCar.setCapacity(b);
        electricCar.engine(); //Battery capacity is 800

    }
}
