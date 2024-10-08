public class Laptop{
    //variables

    String name;
    int price;

    //constructor
    public Laptop(String name,int price){
        this.name=name;
        this.price=price;
    }
//methods
    public static void main(String [] args){
     Laptop l1 = new Laptop ("Hp",50000);
      System.out.println(l1.name+" "+l1.price);
    }
}
