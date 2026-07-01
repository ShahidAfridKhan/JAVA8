package LambdaExpression;
@FunctionalInterface
interface cal{
    int calc(int a,int b);
}

interface cal11{
    int cal(int a);
}
public class Calculator {
    public static void main(String[] args) {
        cal add=(a,b)->a+b;
        cal sub=(int a,int b)->a-b;
        System.out.println(sub.calc(20,89));

        System.out.println(add.calc(90,900));

    }
}
