//super class
class
Animal{
    String name;

    //constructor
    Animal(){
        System.out.println("animal makes sound");
    }
       //method
        void eat(){
          System.out.println("animal eat food");
        }
}
//sub class
class Dog extends Animal{
    int age;

//constructor
    Dog(){
        super();  //calls to super class
            System.out.println("Dog is created");
    }

   //method
    void bark(){
        System.out.println("Dog is barking");
    }
}
public class InheritanceSuper {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
        dog.bark();
    }
}
