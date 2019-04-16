package problems_for_17th.Circle;

import points.Point;

public class Circle {
    private Point center = null;
    private double radius;
    public Circle() {
        center = new Point(0,0);
        radius = 1;
    }
    public Circle(double x,double y,double r) {
        center = new Point(x,y);
        if (r > 0) {
            radius = r;
        }
        else {
            System.out.print("ERROR: Invalid radius");
            radius = 1;
        }
    }
    public double x() {
        return center.x();
    }
    public double y() {
        return center.y();
    }
    public Point center() {
        return center;
    }
    public double radius() {
        return radius;
    }
    public void setX(double iX) {
        center.setX(iX);
    }
    public void setY(double iY) {
        center.setY(iY);
    }
    public void setRadius(double iR) {
        if (iR > 0) {
            radius = iR;
        }
        else {
            System.out.print("ERROR: Invalid radius");
            radius = 1;
        }
    }
    public boolean equals(Object o) {
        if(!(o instanceof Circle)) {
            return false;
        } else {
            Circle co = (Circle)o;
            if(co.center == center && co.radius == radius) {
                return true;
            } else {
                return false;
            }
        }
    }
    public String toString() {
        return "Center: " + center.toString() + ", radius: " + radius;
    }
    public double perimeter() {
        return 2*Math.PI*radius;
    }
    public double area() {
        return Math.PI*Math.pow(radius,2);
    }
}
