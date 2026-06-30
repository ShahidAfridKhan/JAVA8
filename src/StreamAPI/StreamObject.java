package StreamAPI;
import java.util.*;
import java.util.stream.Collectors;
class Data{
    int id;
    String name;

    Data(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class StreamObject {
    public static void main(String[] args) {

        List<String > names=Arrays.asList("shaihd","Afrid","Khan","Pharan","hi");

        names.stream()
                .forEach(i->{
                    System.out.print(i+" ");
                });
        System.out.println();
       long count= names.stream()
                .count();
        System.out.println(count);

       // List<String> newList=names.stream();
        List <Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);
        numbers.stream()
                .forEach(i->{
                    System.out.print(i+" ");
                });

        List<Integer> square=numbers.stream()
                .map(i->i*i-1)
                .collect(Collectors.toList());
        System.out.println();
        System.out.println(square);



    }
}
