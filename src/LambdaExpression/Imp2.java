package LambdaExpression;


interface multiply{
    int mul(int a,int b);
}
interface addition{
    int add(int a,int b);
}

interface divide{
    int div(int a,int b);
}
public class Imp2 {
    public static void main(String[] args) {
        multiply m=(a,b) -> a*b;
        System.out.println(m.mul(20,50));

    }
}
