import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:/Users/iamnr/Desktop/Java/FileClass/myFile.txt");

        if(file.exists()) {
            System.out.println(file.isFile());

            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());

            System.out.println(file.canRead());
            System.out.println(file.canWrite());
        }
        else {
            System.out.println(file.isFile());
        }
    }
}