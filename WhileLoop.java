import java.util.Random;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNum = random.nextInt(100)+1;

        System.out.println("Write a number: ");
        int guessNum = scanner.nextInt();

        while(guessNum != randomNum){
            if(guessNum > randomNum) {
                System.out.println("Your guess is bigger than the number.");
                System.out.println("Guess another number: ");
                guessNum = scanner.nextInt();
            }
            else {
                System.out.println("Your guess is smaller than the number.");
                System.out.println("Guess another number: ");
                guessNum = scanner.nextInt();
            }
        }

        System.out.println("You guess the right number.");
    }
}