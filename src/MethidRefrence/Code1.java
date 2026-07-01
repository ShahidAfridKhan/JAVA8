package MethidRefrence;
import java.util.*;
import java.util.function.Function;

public class Code1 {
    public static void main(String[] args) {
        Function<Integer,Integer> squareRoot=Math::abs;

        System.out.println(squareRoot.apply(-100));
    }
}
