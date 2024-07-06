import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args){
        String day;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which day is this?");
        day = scanner.nextLine();

        switch(day){
            case "Saturday": System.out.println("This is saturday");
            break;
            case "Sunday": System.out.println("This is sunday");
            break;
            case "Monday": System.out.println("This is monday");
            break;
            case "Tuesday": System.out.println("This is tuesday");
            break;
            case "Wednesday": System.out.println("This is wednesday");
            break;
            case "Thursday": System.out.println("This is thursday");
            break;
            case "Friday": System.out.println("This is friday");
            break;
            default: System.out.println("Enter a valid day");
        }
    }
}
