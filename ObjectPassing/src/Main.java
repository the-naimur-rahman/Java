public class Main {
    public static void main(String[] args){
        Garage garage = new Garage();

        Car car1 = new Car("BMW", 2020);
        Car car2 = new Car("Tesla", 2022);

        garage.park(car1);
        garage.park(car2);
    }
}
