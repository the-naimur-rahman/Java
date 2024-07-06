public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("theBread");
        Pizza pizza2 = new Pizza("theBread", "theSauce");
        Pizza pizza3 = new Pizza("theBread", "theSauce", "theCheese");
        Pizza pizza4 = new Pizza("theBread", "theSauce", "theCheese", "theTopping");

        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);

        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);
        System.out.println(pizza2.topping);

        System.out.println(pizza3.bread);
        System.out.println(pizza3.sauce);
        System.out.println(pizza3.cheese);
        System.out.println(pizza3.topping);

        System.out.println(pizza4.bread);
        System.out.println(pizza4.sauce);
        System.out.println(pizza4.cheese);
        System.out.println(pizza4.topping);
    }
}