public class Main {
    public static void main(String[] args){

//        // First Way
//        Person[] people = new Person[4];
//
//        Person person1 = new Person("Azizur Rahman", 50);
//        Person person2 = new Person("Nasrin Akter", 40);
//        Person person3 = new Person("Naimur Rahman", 25);
//        Person person4 = new Person("Khadiza Tahira", 18);
//
//        people[0] = person1;
//        people[1] = person2;
//        people[2] = person3;
//        people[3] = person4;
//
//        System.out.println(people[0]);
//        System.out.println(people[1]);
//        System.out.println(people[2]);
//        System.out.println(people[3]);


        // Second Way
        Person person1 = new Person("Azizur Rahman", 50);
        Person person2 = new Person("Nasrin Akter", 40);
        Person person3 = new Person("Naimur Rahman", 25);
        Person person4 = new Person("Khadiza Tahira", 18);

        Person[] people = {person1, person2, person3, person4};

        System.out.println(people[0]);
        System.out.println(people[1]);
        System.out.println(people[2]);
        System.out.println(people[3]);
    }
}