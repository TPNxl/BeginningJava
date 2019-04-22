package Test.Box;

public class Client {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(3,3);
        System.out.println("b1 is a "+b1.toString());
        System.out.println("b2 is a "+b2.toString());
        System.out.println("The area of box b1 is "+b1.calculateArea());
        System.out.println("The area of box b2 is "+b2.calculateArea());
        System.out.println("The volume of a 3D box with length and width of b1 and height of 2 is "+b1.calculateVolume(2));
        System.out.println("The volume of a 3D box with length and width of b2 and height of 2 is "+b2.calculateVolume(2));
    }
}
