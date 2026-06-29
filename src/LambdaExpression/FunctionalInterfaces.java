package LambdaExpression;

interface add{
    int addtion(int a,int b);
}
interface subb{
    int sub(int a,int b);
}

interface mult{
    int mul(int a,int b);
}

interface div{
    int div(int a,int b);
}

public class FunctionalInterfaces {
    public static void main(String[] args) {

        add add=(a,b)->a+b;

        subb s=(a,b)->a-b;

        mult m=(a,b)->a*b;

        div d=(a,b)->a/b;

        div di=(a,b)->a/b;

        System.out.println(add.addtion(89,900));
        System.out.println(s.sub(49,69));
        System.out.println(m.mul(50,100));
        System.out.println(di.div(900,899));


    }

}
