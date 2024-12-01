package java8;

public class TestMain {          // //step 4 Sealed class

    public static void main(String[] args) {

        Vehicles v=new Bus();
        int result= v.add(1,5);
        System.out.println(result);

        Vehicles v1=new Bike();
        int result1= v1.add(2,2);
        System.out.println(result1);

    }
}
