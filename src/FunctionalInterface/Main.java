package FunctionalInterface;

public class Main {
    public static void main(String[] args) {
        Printing p=()-> System.out.println("hi shahid Afrid khan");

        p.print();

        Calc c=(a,b)->a+b;
        Calc d=(a,b)->a/b;


        System.out.println(c.add(10,70));
        System.out.println(d.add(8000,900));
    }
}
