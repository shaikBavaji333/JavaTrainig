public class student1 {

    //variables
    int id;
    String name;
    static String collegename;

    //constructor
    public student1(int id, String name, String college){
        this.id = id;
        this.name = name;
        this.collegename = collegename;
    }
    //methods
    public static void main(String[] args) {
        student1 s1 = new student1(1,"bavaji",collegename"svu");
                System.out.println(s1.id+" "+s1.name+" "+s1.collegename);
    }
}
