import java.util.Random;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){

        Random random = new Random();
        int randomNumber = random.nextInt(100)+1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number: ");
        int guessNumber = scanner.nextInt();

        for(;guessNumber != randomNumber;){
            if(guessNumber > randomNumber) {
                System.out.println("Your guess is bigger than the number.");
                System.out.println("Guess another number: ");
                guessNumber = scanner.nextInt();
            }
            else {
                System.out.println("Your guess is smaller than the number.");
                System.out.println("Guess another number: ");
                guessNumber = scanner.nextInt();
            }
        }

        System.out.println("You guess the right number.");
    }
}
