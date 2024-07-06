import java.util.Scanner;

public class Arrar2D {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String[][] carName = new String[3][3];

        for(int i = 0; i < carName.length; i++) {
            for(int j = 0; j < carName[i].length; j++) {
                System.out.print("Write car name " + i + j + " : ");
                carName[i][j] = scanner.nextLine();
            }
        }

        for(int i = 0; i < carName.length; i++) {
            for(int j = 0; j < carName[i].length; j++) {
                System.out.print(carName[i][j] + " ");
            }
            System.out.println();
        }
    }
}
