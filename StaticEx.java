public class StaticEx {

    //variables
    int age;
    String name;
    static String CollegeName;

    //constructor
    public StaticEx(int age, String name){
    this.age=age;
    this.name=name;
    }

    //methods
    public static void main(String [] args){
        StaticEx s1=new StaticEx(25,"Bavaji");
        StaticEx s2=new StaticEx(25,"Abu");

        StaticEx.CollegeName="SVU";

            System.out.println(s1.age + " " + s1.name + " " + StaticEx.CollegeName);
            System.out.println(s2.age + " " + s2.name + " " + StaticEx.CollegeName);

    }
}
