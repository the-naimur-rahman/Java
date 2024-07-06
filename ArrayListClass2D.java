import java.util.ArrayList;

public class ArrayListClass2D {
    public static void main(String[] args){
        ArrayList<String> foodList1 = new ArrayList<String>();

        foodList1.add("food1");
        foodList1.add("food2");
        foodList1.add("food3");

        ArrayList<String> foodList2 = new ArrayList<String>();

        foodList2.add("food4");
        foodList2.add("food5");
        foodList2.add("food6");

        ArrayList<String> foodList3 = new ArrayList<String>();

        foodList3.add("food7");
        foodList3.add("food8");
        foodList3.add("food9");

        ArrayList<ArrayList<String>> foodList = new ArrayList<ArrayList<String>>();

        foodList.add(foodList1);
        foodList.add(foodList2);
        foodList.add(foodList3);

        System.out.println(foodList);
        System.out.println(foodList.get(0));
        System.out.println(foodList.get(0).get(0));
    }
}
