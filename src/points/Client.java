package points;

import static points.Point.*;

public class Client {
    public static void main(String[] args) {
        Point p1 = new Point(3,7);
        Point p2 = new Point(-2,-8);
        System.out.println("Point 1 = "+p1.toString());
        System.out.println(p2.y());
        System.out.println("The distance between p1 and p2 is "+ distance(p1,p2));
        System.out.println("p1.isVertical(p2): " + p1.isVertical(p2));
        System.out.println("The slope of a line with p2 and p1 is " + p1.slope(p2));
        System.out.println("Manhattan distance:" + p1.manhattanDistance(p2));
        Point p3 = new Point(4,10);
        System.out.println("p1.isCollinearWith(p2,p3): " + p1.isCollinearWith(p2,p3));
    }
}
