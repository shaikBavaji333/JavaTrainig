package java8;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList<Object> {

    //don't allow any duplicates


    @Override
    public boolean add(Object o) {
        if(this.contains(o)){
            return true;
        }else{
            return super.add(o);
        }

    }

    public static void main(String[] args) {
        CustomArrayList customArrayList=new CustomArrayList();

        customArrayList.add("Pileru");
        customArrayList.add("Bengalore");
        customArrayList.add("Pileru");
        customArrayList.add("Chennai");
        customArrayList.add("Chennai");
        customArrayList.add("Pileru");
        customArrayList.add("Bengalore");

        System.out.println(customArrayList);

    }
}
