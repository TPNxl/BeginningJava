package problems_for_16th.quadratic;

public class ComplexPair {
    private Complex c1;
    private Complex c2;
    public ComplexPair() {
        c1 = new Complex(0,0);
        c2 = new Complex(0,0);
    }
    public ComplexPair(double ic1re, double ic1im, double ic2re, double ic2im) {
        c1 = new Complex(ic1re,ic1im);
        c2 = new Complex(ic2re,ic2im);
    }
    public ComplexPair(Complex ic1, Complex ic2) {
        c1 = ic1;
        c2 = ic2;
    }
    public double c1re() {
        return c1.re();
    }
    public double c1im() {
        return c1.im();
    }
    public double c2re() {
        return c2.re();
    }
    public double c2im() {
        return c2.im();
    }
    public String toString() {
        return "C1: " + c1.toString() + " C2: " + c2.toString();
    }


}
