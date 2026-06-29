package FunctionalInterface;
@FunctionalInterface
interface Bank{
    int rate(int a,int b);
}
interface print{
    void print();
}

public class Code {
    public static void main(String[] args) {
      //  Bank b=(a,b)->a*b;

        //System.out.println(b.rate(89,89));

       print p=()-> System.out.println("Shahid Afrid Khan");

       p.print();

    }
}
