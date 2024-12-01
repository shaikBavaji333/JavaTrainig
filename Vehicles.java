package java8;

public abstract sealed class    Vehicles permits Car,Bus {       //step 1 Sealed class
    abstract  int add(int a,int b);
}
