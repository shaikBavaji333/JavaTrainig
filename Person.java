package java8;

public record Person(int id,String name,double salary) {      //Ex on record class.

   public int add(int a, int b){
       return a+b;
   }

    public static void main(String[] args) {
        Person p=new Person(1,"Bavaji",2000.0);
        int result=p.add(12,4);
        System.out.println(p.id+" "+p.name+" "+p.salary);
        System.out.println(result);
    }
}
