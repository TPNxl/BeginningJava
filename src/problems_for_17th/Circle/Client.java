package problems_for_17th.Circle;

// Client class for circle

public class Client {
    public static void main(String[] args) {
        Circle c = new Circle(0,0,1);
        System.out.println(c.toString());
        System.out.println("Area: "+c.area());
        System.out.println("Circumference: "+c.perimeter());
    }
}
