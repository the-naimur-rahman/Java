public class Vehicle {
    String name;

    Vehicle(String name){
        this.name = name;
    }

    void go(){
        System.out.println(name + " Moving");
    }

    void stop(){
        System.out.println(name + " Stopped");
    }
}
