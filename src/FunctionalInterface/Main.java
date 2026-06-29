package FunctionalInterface;

public class Main {
    public static void main(String[] args) {
        Printing p=()-> System.out.println("hi shahid Afrid khan");

        p.print();

        Calc c=(a,b)->a+b;

        System.out.println(c.add(10,70));
    }
}
