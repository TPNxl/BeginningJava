package problems_for_17th.quadratic;

// Encapsulates a quadratic equation

public class Quadratic {
    private double a;
    private double b;
    private double c;
    public Quadratic() {
        a = 1;
        b = 0;
        c = 0;
    }
    public Quadratic(double ia, double ib, double ic) {
        a = ia;
        b = ib;
        c = ic;
    }
    public double a() {
        return a;
    }
    public double b() {
        return b;
    }
    public double c() {
        return c;
    }
    public String toString() {
        return a+"x^2 + "+b+"x + "+c;
    }
    public boolean equals(Object o) {
        if(!(o instanceof Quadratic)) {
            return false;
        } else {
            Quadratic qO = (Quadratic)o;
            if(qO.a == a && qO.b == b && qO.c == c) {
                return true;
            } else {
                return false;
            }
        }
    }
    public boolean isLinear() {
        if (a == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isConst() {
        if (a == 0 && b == 0) {
            return true;
        } else {
            return false;
        }
    }
    public double disc() {
        return Math.pow(b,2)-(4*a*c);
    }
    public ComplexPair roots() {
        ComplexPair cp = null;
        double disc = Math.pow(b,2)-(4*a*c);
        double realA;
        if (a == 0) {
            realA = -c/b;
            cp = new ComplexPair(realA,0,realA,0);
        } else if (disc == 0) {
            cp = new ComplexPair(-b/(2*a),0,-b/(2*a),0);
        } else if (disc > 0) {
            cp = new ComplexPair((-b+Math.pow(disc,0.5))/(2*a),0,(-b-Math.pow(disc,0.5))/(2*a),0);
        } else if (disc < 0) {
            cp = new ComplexPair(-b/(2*a),Math.pow(Math.abs(disc),0.5)/(2*a),-b/(2*a),-1*Math.pow(Math.abs(disc),0.5)/(2*a));
        }
        return cp;
    }
}
