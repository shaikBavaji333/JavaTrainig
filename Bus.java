package java8;

public final class  Bus extends Vehicles{   // //step 3 Sealed class
    @Override
    int add(int a, int b) {
        return a+b;
    }
}
