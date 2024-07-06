import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("C:\\Users\\iamnr\\Desktop\\Java\\FileReaderClass\\ascii-text-art.txt")){
            int data = reader.read();

            while(data != -1){
                System.out.print((char)data);
                data = reader.read();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}