import java.util.Random;
public class TestingMath {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] values = new double[3];
        for(int i = 0; i < values.length; i++) {
            values[i] = (double)Math.round(rand.nextDouble()*10000)/100;
            System.out.println("The value at index "+i+" is "+values[i]);
        }
        double temp = 0;
        for (double value : values) {
            temp += value;
        }
        temp = (double)Math.round(temp*100)/100;
        System.out.println("Sum: "+temp);
        double product = values[0];
        for(int i = 1; i < values.length; i++) {
            product *= values[i];
        }
        temp = (double)Math.round(product*100)/100;
        System.out.println("Product: "+temp);
        temp = values[0];
        for(int i = 1; i < values.length; i++) {
            if(values[i]>temp) {
                temp = values[i];
            }
        }
        System.out.println("Max: "+temp);
        temp = values[0];
        for(int i = 1; i < values.length; i++) {
            if(values[i]<temp) {
                temp = values[i];
            }
        }
        System.out.println("Min: "+temp);
        for (double value : values) {
            System.out.println("The square root of " + value + " is " + (double) Math.round(Math.pow(value, 0.5) * 100) / 100);
        }
        System.out.println("The square root of the products is " + (double) Math.round(Math.pow(product, 0.5) * 100) / 100);
    }
}
