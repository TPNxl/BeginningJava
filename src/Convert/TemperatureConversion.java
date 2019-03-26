package Convert;
public class TemperatureConversion {
    public static double FtoC(double input) {
        return (5*(input - 32)/9);
    }
    public static double CtoF(double input) {
        return (9*input/5)+32;
    }
    public static void main( String[] args) {
        int input = 72;
        System.out.println(input + " in Celsius is " + FtoC(input));
        System.out.println("Converted back to Fahrenheit that is " + CtoF(FtoC(input)));
    }
}
