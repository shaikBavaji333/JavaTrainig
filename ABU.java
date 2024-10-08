public class ABU {
    //variables
    String name;
    int age;

    //constructor
    public ABU(String name,int age){
        this.name=name;
        this.age=age;
    }


public static void main (String[] args){
        ABU a =new ABU("Abu",20);
        System.out.println(a.name+"  "+a.age);
    }
}
