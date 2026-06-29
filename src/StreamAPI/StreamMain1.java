package StreamAPI;
import java.util.*;
import java.util.stream.Collectors;

public class StreamMain1 {
    public static void main(String[] args) {
        //Create the list and filter the list the even numbers
        /*
        List<Integer> L1=new ArrayList<>();
        L1.add(10);
        L1.add(20);
        L1.add(43);
        L1.add(89);
        L1.add(33);
        List <Integer> EvenList=new ArrayList<>();
         for(int i:L1){
            if(i%2==0){
                EvenList.add(i);
            }
        }
        System.out.println(L1);
        System.out.println(EvenList);

         */
        List<Integer> list1=Arrays.asList(1,2,3,4,5,9);

        List<Integer>newList=list1.stream()
                .filter(i->i%2==0)
                .collect(Collectors.toList());

        System.out.println(newList);

    }
}
