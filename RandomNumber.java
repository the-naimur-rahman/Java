import java.util.Random;
public class RandomNumber {
    public static void main(String[] args){
        Random random = new Random();

        int intRandom = random.nextInt();
        double doubleRandom = random.nextDouble();
        boolean boolRandom = random.nextBoolean();

        System.out.println(intRandom);
        System.out.println(doubleRandom);
        System.out.println(boolRandom);
    }
}
