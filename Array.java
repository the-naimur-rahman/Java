import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        String[] fullName = new String[4];
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= fullName.length; i++) {
            System.out.print("Write name " + i + " : ");
            fullName[i-1] = scanner.nextLine();
        }

        for(int i = 0; i < fullName.length; i++) {
            System.out.println("Name " + (i + 1) + " : " + fullName[i]);
        }
    }
}
