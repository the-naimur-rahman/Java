import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Write a number to divide: ");
            double x = scanner.nextDouble();

            System.out.print("Write a number to divide by: ");
            double y = scanner.nextDouble();

            double z = x / y;
            System.out.println("Answer: " + z);
        } catch(InputMismatchException e) {
            System.out.println("Please input numbers only.");
        }
    }
}