import java.util.Random;

public class VarialbeScopeGlobal {
    public static void main(String[] args){
        DicerollerGlobal dicerollerGlobal = new DicerollerGlobal();
    }
}

class DicerollerGlobal{
    Random random;
    int number;

    DicerollerGlobal(){
        random = new Random();
        roll();
    }

    void roll(){
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}