package points;

public class Point {
    private double x = 0;
    private double y = 0;
    // Constructors
    public Point() {
        setLocation(0,0);
    }
    public Point(double xInput, double yInput) {
        setLocation(xInput, yInput);
    }
    public Point(Point p) {
        setLocation(p.x,p.y);
    }
    // Accessors
    public double x() { return x; }
    public double y() { return y; }

    // Mutators
    public void setX(double input) { x = input; }
    public void setY(double input) { y = input; }
    public void translateX(double input) { x += input; }
    public void translateY(double input) { y += input; }
    public void setLocation(double xInput, double yInput) {
        setX(xInput);
        setY(yInput);
    }

    public void translate(double dx, double dy) {
        translateX(dx);
        translateY(dy);
    }
    public double distanceFrom(Point p) { return Math.sqrt(Math.pow(p.x-x,2)+Math.pow(p.y-y,2)); }
    public static double distance(Point p1, Point p2) { return Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2)); }

    // Monday's class
    public boolean isVertical(Point p) {
        if(p.x == x) {
            return true;
        } else {
            return false;
        }
    }
    public double slope(Point p) {
        return((p.y - y)/(p.x - x));
    }
    public double manhattanDistance(Point p) {
        return Math.abs(p.x - x) + Math.abs(p.y - y);
    }
    public boolean isCollinearWith(Point p1, Point p2) {
        if(p1.x == x && p2.x == x) {
            return true;
        } else if ((double)Math.round(slope(p1)*10000)/10000 == (double)Math.round(slope(p2)*10000)/10000) {
            return true;
        } else {
            return false;
        }
    }

    // toString, equals
    public String toString() { return("("+x+","+y+")"); }
    public boolean equals(Object p) {
        if(!(p instanceof Point)) {
            return false;
        }
        else {
            Point objP = (Point)p;
            if(objP.x==x && objP.y==y) {
                return true;
            } else {
                return false;
            }
        }
    }
}
