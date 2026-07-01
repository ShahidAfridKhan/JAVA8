package PredefinedFunctionalInterfaces;
import java.util.*;

interface Cal{
    int add(int a,int b);
}

public class Predicate {
    public static void main(String[] args) {

        Cal ad=(a,b)->a+b;
        System.out.println(ad.add(10,30));

    }
}
