package MethidRefrence;
import java.util.*;
public class MethodRefrence {
    public static void main(String[] args) {
        List<String> List=Arrays.asList("shahid","Afrid","Khan","Pathan","Manuu");

        List.stream()
                .forEach(System.out::println);

    }

}
