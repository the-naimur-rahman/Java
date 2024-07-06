public class OverloadedMethod {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        System.out.println(add(num1, num2));
        System.out.println(add(num1, num2, num3));

        double doubleNum1 = 10.11;
        double doubleNum2 = 20.22;
        double doubleNum3 = 30.33;

        System.out.println(add(doubleNum1, doubleNum2));
        System.out.println(add(doubleNum1, doubleNum2, doubleNum3));
    }

    static int add(int num1, int num2){
        int addition = num1 + num2;
        return addition;
    }

    static double add(double num1, double num2){
        double addition = num1 + num2;
        return addition;
    }

    static int add(int num1, int num2, int num3){
        int addition = num1 + num2 + num3;
        return addition;
    }

    static double add(double num1, double num2, double num3){
        double addition = num1 + num2 + num3;
        return addition;
    }
}
