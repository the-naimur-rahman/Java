import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        try(FileWriter writer = new FileWriter("C:\\Users\\iamnr\\Desktop\\Java\\FileWriterClass\\myFile.txt")) {
            System.out.println("Write something in file: ");
            String myFileText = scanner.nextLine();
            writer.write(myFileText);
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}