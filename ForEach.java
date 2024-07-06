import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args){
        // Foreach Loop in Array
        String[] animal = {"animal1", "animal2", "animal3"};

        for(String i : animal){
            System.out.println(i);
        }
        System.out.println();

        // Foreach Loop in ArrayList
        ArrayList<String> animalList = new ArrayList<String>();

        animalList.add("animal1");
        animalList.add("animal2");
        animalList.add("animal3");

        for(String i : animalList){
            System.out.println(i);
        }
    }
}
