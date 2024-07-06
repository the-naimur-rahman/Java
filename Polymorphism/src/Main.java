public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Car car = new Car();
        Ship ship = new Ship();
        Boat boat = new Boat();

        Vehicle[] vehicle = {bus, car, ship, boat};

        for(Vehicle i : vehicle){
            i.go();
        }
    }
}