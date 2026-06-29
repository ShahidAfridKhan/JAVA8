package FunctionalInterface;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable r=()->{for(int i=-0;i<10;i++){
            System.out.println("hi"+i);
        }};
        r.run();
    }
}
