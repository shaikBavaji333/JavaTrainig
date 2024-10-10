public class Instance {

        //variables
        String name;
        int age;

        //constructor
        public Instance (String name,int age){
            this.name=name;
            this.age=age;
        }
        //methods
        public static void main (String[] args){
            Instance p1=new Instance("Bavaji",25);
            System.out.println(p1.name+" "+p1.age);

        }

}
