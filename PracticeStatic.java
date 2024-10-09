public class PracticeStatic {

    //variables
    String name;
    int age;
    static String collegeName;

    //constructor
    public PracticeStatic (String name,int age){
        this.name=name;
        this.age=age;
    }

    //methods
    public static void main (String[] args){
        PracticeStatic p1=new PracticeStatic("Bavaji",25);
        PracticeStatic p2=new PracticeStatic("Teja",25);
        PracticeStatic p3=new PracticeStatic("Irfan",25);

        PracticeStatic.collegeName="SVU";

        System.out.println(p1.name+" "+p1.age+"  "+        PracticeStatic.collegeName);
        System.out.println(p2.name+" "+p2.age+" "+        PracticeStatic.collegeName);
        System.out.println(p3.name+" "+p3.age+"  "+        PracticeStatic.collegeName);
    }
}
