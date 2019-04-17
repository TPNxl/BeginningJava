package problems_for_17th.quadratic;

// Encapsulates a complex number

public class Complex {
    private double re;
    private double im;
    public Complex() {
        re = 0;
        im = 0;
    }
    public Complex(double inputre, double inputim) {
        re = inputre;
        im = inputim;
    }
    public double re() {
        return re;
    }
    public double im() {
        return im;
    }
    public void setRe(double value) {
        re = value;
    }
    public void setIm(double value) {
        im = value;
    }
    public String toString() {
        if(re == 0) {
            return im + "i";
        } else if (im == 0) {
            return Double.toString(re);
        } else {
            return re + " + " + im + "i";
        }
    }
    public boolean equals(Object o) {
        if(!(o instanceof Complex)) {
            return false;
        } else {
            Complex comO = (Complex)o;
            if(comO.re == re && comO.im == im) {
                return true;
            } else {
                return false;
            }
        }
    }
    public boolean isRe() {
        if(im == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isImaginary() {
        if(re == 0) {
            return true;
        } else {
            return false;
        }
    }
}
