import java.util.Scanner;

public class averageweather {
    public static void main( String[] args) {
        double[] temp = new double[12];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < temp.length; i++) {
            int j = i+1;
            System.out.println("Enter the temperature for month #" + j + ":");
            temp[i] = sc.nextDouble();
        }
        double tempAverage = 0.0;
        for(int i = 0; i < temp.length; i++) {
            tempAverage += temp[i];
        }
        tempAverage /= temp.length;
        System.out.println("The average temperature is " + tempAverage);
        double tempMax = temp[0];
        for(int i = 0; i < temp.length; i++) {
            if(tempMax < temp[i]) {
                tempMax = temp[i];
            }
        }
        System.out.println("The maximum temperature is " + tempMax);
        double tempMin = temp[0];
        for(int i = 0; i < temp.length; i++) {
            if(tempMin > temp[i]) {
                tempMin = temp[i];
            }
        }
        System.out.println("The minimum temperature is " + tempMin);
    }
}
