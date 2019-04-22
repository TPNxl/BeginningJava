package Test.Box;

import points.Point;

public class Box {
    private double length;
    private double width;
    public Box() {
        length = 1;
        width = 1;
    }
    public Box(double lengthI, double widthI) {
        length = Math.abs(lengthI);
        width = Math.abs(widthI);
    }
    public Box(Point p1, Point p2) {
        length = Math.abs(p1.x()-p2.x());
        width = Math.abs(p1.y()-p2.y());
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public void setLength(double i) {
        length = i;
    }
    public void setWidth(double i) {
        width = i;
    }
    public double calculateArea() {
        return length*width;
    }
    public double calculateVolume(double h) {
        return length*width*h;
    }
    public String toString() {
        return "Box with length " + length + " and width " + width;
    }
}
