public class SwapTwoVariables {
    public static void main(String[] args){
        String water = "This is water.";
        String juice = "This is juice.";

        String temp;

        temp = water;
        water = juice;
        juice = temp;

        System.out.println(water);
        System.out.println(juice);
    }
}
