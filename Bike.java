public class Bike {
    String colour;
    int speed;
    double cost;

    public Bike (String colour,int speed,double cost) {
        this.colour = colour;
        this.speed = speed;
        this.cost = cost;
    }
    public static void main(String[]args) {
        Bike bike = new Bike("red",10,5.0);
        System.out.println(bike.colour+" "+bike.speed+" "+bike.cost);
    }
}