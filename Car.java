public class Car {
    String colour;
    int speed;
    double cost;

    public Car(String colour, int speed, double cost) {
        this.colour = colour;
        this.speed = speed;
        this.cost = cost;
    }
    public static void main(String[]args) {
        Car c1 = new Car("red",10,5.0);
        Car c2 = new Car("blue",15,6.0);
        System.out.println(c1.colour+" "+c1.speed+" "+c1.cost);
        System.out.println(c2.colour+" "+c2.speed+" "+c2.cost);
    }
}