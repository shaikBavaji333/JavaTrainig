package java8;

import java.util.ArrayList;
import java.util.List;

public class ExOnArrayList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("Bavaji");
        list.add("Liya");
        list.add("Teja");
        list.add("Bavaji");

        for(String s :list){
            System.out.println(s);
        }

        System.out.println(list);
    }
}
