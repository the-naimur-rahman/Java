import java.util.Scanner;

public class NestedWhileLoop {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write number of rows:");
        int rows = scanner.nextInt();

        System.out.println("Write symbol:");
        String symbol = scanner.next();

        System.out.println();

        int i = rows;
        while(i > 0) {
            int j = i;
            while(j > 0) {
                System.out.print(symbol + " ");
                j--;
            }
            i--;
            System.out.println();
        }
    }
}
