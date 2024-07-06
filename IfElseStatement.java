import java.util.Scanner;
public class IfElseStatement {
    public static void main(String[] args){
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your age?");
        age = scanner.nextInt();

        if((age >= 16) && (age <= 80)){
            System.out.println("You are eligible.");
        }
        else if(age > 80){
            System.out.println("You are not eligible.");
        }
        else{
            System.out.println("You are not eligible.");
        }
    }
}
