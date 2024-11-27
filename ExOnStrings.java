package java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExOnStrings {   //String is sequence of character
    public static void main(String[] args) {

        String s=new String("Bavaji");
        String s1=new String("Bavaji");

        System.out.println(s.equals(s1));
        System.out.println(s==s1);

        String[] nameArrays=s.split("");

        Map<String,Long> countCharacters= Arrays.stream(s.split("")).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

    System.out.println(countCharacters);
    }
}
