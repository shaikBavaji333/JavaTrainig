package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class OddevenJdk8 {
    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // one method to find even odd
        List<Integer> evenNumers=integerList.stream().filter(e-> e%2==0).toList();
        evenNumers.forEach(System.out::println);

        // second method to find even odd
        integerList.stream().filter(e-> e%2==0).forEach(System.out::println);
    }
}
