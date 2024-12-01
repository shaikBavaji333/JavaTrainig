package java8;

public final class Bike1 extends Vehicles{  //step 2 sealed class
    @Override
    int add(int a, int b) {
        return a+b;
    }
}
