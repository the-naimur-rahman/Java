import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("What's your username?");
        String userName = scanner.nextLine();

        System.out.println("What's your age?");
        int age = scanner.nextInt();

        System.out.println("What's your height?");
        double height = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("You are " + name);
        System.out.println("Your username " + userName);
        System.out.println("Your age " + age);
        System.out.println("Your height " + height);
    }
}