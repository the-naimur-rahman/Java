public class Method {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;

        int addition = add(num1, num2);
        int subtraction = sub(num1, num2);
        int multiplication = mul(num1, num2);
        int division = div(num1, num2);

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
    }

    static int add(int num1, int num2){
        int addition = num1 + num2;
        return addition;
    }

    static int sub(int num1, int num2){
        int subtraction = num1 - num2;
        return subtraction;
    }

    static int mul(int num1, int num2){
        int multiplication = num1 * num2;
        return multiplication;
    }

    static int div(int num1, int num2){
        int division = num1 / num2;
        return division;
    }
}
