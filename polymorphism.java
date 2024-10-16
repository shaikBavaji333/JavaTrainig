class Calculator{
    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c) {
         return a+b+c;

    }
}

public class polymorphism {
    public static void main(String[] args) {

        Calculator c=new Calculator();

        int result=c.add(9,4);
        System.out.println("Two args method result"+result);

        int result2=c.add(6,6,5);
        System.out.println("Three args method result"+result2);

    }
}
