import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int rows;
        String symbol;

        System.out.println("Enter number of rows:");
        rows = scanner.nextInt();

        System.out.println("Enter symbol:");
        symbol = scanner.next();

        System.out.println();

        for(int i = rows; i > 0; i--) {
            for(int j = i; j > 0; j--) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
