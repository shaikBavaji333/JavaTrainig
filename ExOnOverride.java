//Super class
class Animal1{

    public void display(){
    System.out.println("Super class Implementation of Animal class");
    }

    public int add(int a, int b){
        return a+b;
    }
}

//Sub class
class cat extends Animal1{
    @Override
    public void display(){
        System.out.println("Sub class Implementation");
    }
    @Override
    public int add(int a, int b){
        return a+b;
    }
}

public class ExOnOverride {
    public static void main(String[] args) {
        //By using super class reference
        //by using sub class

        Animal1 a=new Animal1();
        a.display();

        Animal1 b=new cat();
        b.display();

        cat c=new cat();
        c.display();
    }
}
