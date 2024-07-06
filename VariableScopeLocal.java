import java.util.Random;

public class VariableScopeLocal {
    public static void main(String[] args){
        DicerollerLocal dicerollerLocal = new DicerollerLocal();
    }
}

class DicerollerLocal{
    DicerollerLocal(){
        Random random = new Random();
        int number = 0;
        roll(random, number);
    }

    void roll(Random random, int number){
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
