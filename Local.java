class Demo {

    public void display() {
        String name = "Bavaji";
        int age = 10;
        System.out.println(name + " " + age);
    }
}
    public class Local {
        public static void main(String[] args) {
            Demo l1 = new Demo();
            l1.display();
        }
    }