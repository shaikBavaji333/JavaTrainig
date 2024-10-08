public class Static {
    //variables
    String name;
    int age;
    static String collegeName;

    //constructor
    public Static (String name,int age){
        this.name=name;
        this.age=age;
    }
    //methods
    public static void main (String[] args){
        Static s1=new Static("Bavaji",24);
        Static s2=new Static("Teja",24);
        Static.collegeName="Margadarsi";


        System.out.println(s1.name+"  "+s1.age+"  "+Static.collegeName);
        System.out.println(s2.name+"  "+s2.age+"  "+Static.collegeName);
    }
}
