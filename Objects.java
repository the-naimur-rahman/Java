public class Objects {
    public static void main(String[] args){
        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.year);
        System.out.println(car1.price);

        System.out.println();

        System.out.println(car2.make);
        System.out.println(car2.model);
        System.out.println(car2.color);
        System.out.println(car2.year);
        System.out.println(car2.price);
    }
}

class Car {
    String make = "Chevrolete";
    String model = "Corvette";
    String color = "Blue";
    int year = 2020;
    double price = 50000;
}
