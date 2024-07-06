public class StringMethod {
    public static void main(String[] args) {
        String name = "Naimur Rahman";

        boolean resultEquals1 = name.equals("Naimur Rahman");
        boolean resultEquals2 = name.equals("naimur rahman");
        boolean resultEqualsIgnoreCase1 = name.equalsIgnoreCase("Naimur Rahman");
        boolean resultEqualsIgnoreCase2 = name.equalsIgnoreCase("naimur rahman");
        int resultLength = name.length();
        int resultIndexOf = name.indexOf('N');
        char resultCharAt = name.charAt(0);
        String resultUpper = name.toUpperCase();
        String resultLower = name.toLowerCase();
        String resultReplace = name.replace('N', 'T');

        System.out.println(resultEquals1);
        System.out.println(resultEquals2);
        System.out.println(resultEqualsIgnoreCase1);
        System.out.println(resultEqualsIgnoreCase2);
        System.out.println(resultLength);
        System.out.println(resultIndexOf);
        System.out.println(resultCharAt);
        System.out.println(resultUpper);
        System.out.println(resultLower);
        System.out.println(resultReplace);
    }
}