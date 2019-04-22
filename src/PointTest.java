import java.awt.*;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 17;
        p1.y = 9;
        Point p2 = new Point();
        p2.x = 4;
        p2.y = -1;
        Point p3 = p2;

        p1.translate(3,1);
        p2.x = 50;
        p3.translate(-4,5);
        System.out.print(p1.toString() + p2.toString() + p3.toString());

    }
}
