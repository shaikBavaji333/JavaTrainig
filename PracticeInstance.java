public class PracticeInstance {
    //variables
    String name;
    int age;
    //constructor
    public PracticeInstance (String name,int age){
        this.name=name;
        this.age=age;
    }
    //methods
    public static void main (String[] args){
        PracticeInstance p1=new PracticeInstance("Bavaji",25);
        System.out.println(p1.name+" "+p1.age);
        
    }
}
