package LambdaExpression;

interface Greeting{
    void SayHello();
}

public class Implemenation {
    public static void main(String[] args) {
        Greeting g=()-> System.out.println("Hello Bto@@");
        g.SayHello();
    }
}
