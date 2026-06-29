package StreamAPI;
import java.util.Arrays;
import java.util.List;

public class Stream1{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50);

        /*
        for(Integer i : list){
            System.out.println(i);
        }
        */
        //List<Integer> l2=Arrays.asList("shahid","Afrid","Kahn");

        /*
        for(int i:l2)}{
        sout(i)
         */

        list.stream()
                .forEach(x-> System.out.println(x));
    }
}