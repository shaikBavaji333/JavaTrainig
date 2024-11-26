//Abstract class
abstract class Animal3{

    //abstract method
    abstract void Sound();

    //concrete method
    void sleep(){
        System.out.println("Sleeping...");
    }
}
//subclass providing implementation of abstract methods.
class Dog extends Animal3{
    @Override
    void Sound() {
        System.out.println("Barks");
    }

    @Override
    void sleep() {
        super.sleep();
    }
}
// main class.
public class ExOnAbstractClass {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.Sound();
        d.sleep();
    }
}
