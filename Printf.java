public class Printf {
    public static void main(String[] args){
        boolean boolValue = true;
        char charValue = '@';
        String stringValue = "Naimur Rahman";
        int intValue = 123;
        double doubleValue = 123.123;

        System.out.printf("%b %b", boolValue, boolValue);
        System.out.println();

        System.out.printf("%c %c", charValue, charValue);
        System.out.println();

        System.out.printf("%s %s", stringValue, stringValue);
        System.out.println();

        System.out.printf("%d %d", intValue, intValue);
        System.out.println();

        System.out.printf("%f %f", doubleValue, doubleValue);
        System.out.println();
    }
}
