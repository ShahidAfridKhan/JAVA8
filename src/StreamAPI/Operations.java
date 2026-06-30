package StreamAPI;
import java.util.*;
import java.util.stream.Collectors;
public class Operations {
    public static void main(String[] args) {
        List <Integer> list=Arrays.asList(10,20,30,40,50,60);


        //1.Stream
        System.out.println("Original List");
        list.stream()
                .forEach(System.out::println);
        //2.filter
        System.out.println("Even Numbers");
        List<Integer> even=list.stream()
                .filter(i->i%2==0)
                .collect(Collectors.toList());
        System.out.println(even);

        //3.Map()
        System.out.println("Square of the number");
        List<Integer> Square=list.stream()
                .map(i->i*i)
                .collect(Collectors.toList());
        System.out.println(Square);

        //4.Sorted()
        System.out.println("Sorted Order");
        List<Integer> Sorted=list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(Sorted);

        //Descending Order
        System.out.println("Descending Order");

        List<Integer> DescOrder=list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(DescOrder);

        //5.Distinct -> means unique elements in an array ot List
        System.out.println("Distinct Order");
        List<Integer> Distinct=list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(Distinct);

        //6.Collect
        System.out.println("Collect use");
        List<Integer> Collect=list.stream()
                .collect(Collectors.toList());
        System.out.println(Collect);

        //7.ForEach
        System.out.println("For Each Loop");

        list.stream().forEach(i-> System.out.print((i+" ")));

        //8.Count
        long count =list.stream()
                .count();
        System.out.println(count);


    }
}
