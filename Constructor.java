public class Constructor {
    public static void main(String[] args){
        Human human1 = new Human("Naimur Rahman", 25);
        Human human2 = new Human("Khadiza Tahira", 18);

        human1.eat();
        human1.drink();

        human2.eat();
        human2.drink();
    }
}

class Human {
    String name;
    int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println(this.name + " is eating.");
    }

    void drink() {
        System.out.println(this.name + " is drinking.");
    }
}
