public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Azizur Rahman");
        Friend friend2 = new Friend("Nasrin Akter");
        Friend friend3 = new Friend("Naimur Rahman");
        Friend friend4 = new Friend("Khadiza Tahira");

        System.out.println();
        System.out.println(Friend.numberOfFriend);
        System.out.println();

        Friend.friend("Azizur Rahman");
        Friend.friend("Nasrin Akter");
        Friend.friend("Naimur Rahman");
        Friend.friend("Khadiza Tahira");
     }
}