package Convert;
public class MetricLength {
    public static void main( String[] args ) {
        final double CM_PER_INCH = 2.54;
        double inches = 23;
        double centimeters = inches * CM_PER_INCH;
        System.out.println("The original inches value is " + inches + "; that value in centimeters is " + centimeters);
    }
}
