class BLocal{

    public void display(){

        String name="Bavaji";
        int age=25;
        System.out.println(name+" "+age);
    }
}
public class PLocal {
    public static void main(String[] args){
        BLocal l1=new BLocal();
        l1.display();
    }
}
