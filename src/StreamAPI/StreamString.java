package StreamAPI;
import java.util.*;
public class StreamString {
    public static void main(String[] args) {

        List<String> list=Arrays.asList("sai","shih","usjh");

        list.stream()
                .forEach(n-> System.out.println(n));
        /*
        for(int i:ans){
            System.out.println(i+" ");
        }
        */


    }
}
