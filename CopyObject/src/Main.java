public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "X10", 2024);
        Car car2 = new Car("Tesla", "Model S", 2024);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println();

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());

        System.out.println();

        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

        System.out.println();

        car1.copy(car2);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println();

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());

        System.out.println();

        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
    }
}