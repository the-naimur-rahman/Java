public class Friend {
    String name;
    static int numberOfFriend;

    Friend(String name){
        this.name = name;
        System.out.println("Hello " + name);
        numberOfFriend++;
    }

    static void friend(String name){
        System.out.println("Hello " + name);
    }
}
