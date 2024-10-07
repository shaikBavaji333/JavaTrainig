public class Student {
    String name;
    int age;
    int rollnumber;
    public Student(String name, int age, int rollnumber) {
        this.name = name;
        this.age = age;
        this.rollnumber = rollnumber;
    }
        public static void main(String [] args) {
                Student s1=new Student("Bavaji",18,12345);
                Student s2=new Student("Shaik",19,67890);
                System.out.println(s1.name+" "+s1.age+" "+s1.rollnumber);
                System.out.println(s2.name+" "+s2.age+" "+s2.rollnumber);

    }
}
