package PackageOne;
import PackageTwo.*;

public class A {
    public static void main(String[] args){

        B b = new B();
        SubA subA = new SubA();
        SubB subB = new SubB();

        System.out.println(b.publicMessage);
        System.out.println(b.protectedMessage);
        System.out.println(b.defaultMessage);
        System.out.println();

        System.out.println(subA.publicMessage);
        System.out.println();

        System.out.println(subB.publicMessage);
        System.out.println();
    }
}
