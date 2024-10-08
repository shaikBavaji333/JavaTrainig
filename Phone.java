public class Phone {
    //variables
    String name;
    int price;
//constructor
    public Phone (String name,int price){
    this.name = name;
    this.price = price;
    }
    //methods
    public static void main(String [] args){
        Phone p1 = new Phone ("one plus",45000);
        System.out.println(p1.name);
        System.out.println(p1.price);
    }
}
