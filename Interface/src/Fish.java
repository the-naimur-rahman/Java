public class Fish implements Prey, Predator{

    @Override
    public void flee(){
        System.out.println("This fish is fleeing form larger fishes.");
    }

    @Override
    public void hunt(){
        System.out.println("This fish is hunting smaller fishes.");
    }
}
