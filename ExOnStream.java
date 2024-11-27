package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExOnStream {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,2,2,3,4,5,6,7,8,9,9,10,11,22,22);

        //  unique values
        List<Integer> UniqueAndSorting=numbers.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(UniqueAndSorting);
    }
}
