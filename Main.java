package java8;

public class Main {
    public static void main(String[] args) {

        Sample s=(a, b) -> a+b;
        int result=s.add(4,6);
        System.out.println(result);

        //() -> expression
    }
}
