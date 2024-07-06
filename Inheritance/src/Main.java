public class Main {
    public static void main(String[] args) {
        Aeroplane aeroplane = new Aeroplane("Boeing");
        Car car = new Car("BMW");
        Boat boat = new Boat("Ninja");

        aeroplane.go();
        aeroplane.stop();

        car.go();
        car.stop();

        boat.go();
        boat.stop();
    }
}