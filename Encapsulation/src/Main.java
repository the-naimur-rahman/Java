public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X10", 2024);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        System.out.println();

        car.setMake("Tesla");
        car.setModel("Model S");
        car.setYear(2024);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}