package TPNxl;
public class Main {

    // Cool functions

    public static double kgToLb(double input) {
        return input*2.20462;
    }
    public static double inToMm(double input) {
        return input*25.4;
    }
    public static double circumference(double radius) {
        return 2*3.14159*radius;
    }

    // Main code

    public static void main(String[] args) {

        /* Short program answers - chapter 2

        // Calculates and outputs the square of each integer from 1 to 9
        final int goToValue = 9;
        for(int i = 1; i <= goToValue; i++) {
            System.out.println(i*i);

        // Calculates and outputs the average of integers 1, 7, 9, 34
        int[] numberArray = new int[4];
        numberArray[0] = 1;
        numberArray[1] = 7;
        numberArray[2] = 9;
        numberArray[3] = 34;
        float average = 0;
        for(int i = 0; i < numberArray.length; i++){
            average += numberArray[i];
        }
        average /= numberArray.length;
        System.out.print("The average of the integers ");
        for (int i = 0; i < numberArray.length; i++) {
            if (i == numberArray.length - 1) {
                System.out.print("and " + numberArray[i] + " ");
            }
            else {
                System.out.print(numberArray[i] + ", ");
            }
        }
        System.out.println("is " + average);

        // Outputs "****"

        for(int i = 0; i < 4; i++) {
            System.out.print("*");
        }



        // Outputs an "X"
        System.out.println("*   *\n * *\n  *\n * *\n*   *");

        // Converts kg to lb (10, 50, 100)
        double[] values = {10, 50, 100};
        for(int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " KG in LB is " + kgToLb(values[i]) + " LB");
        }

        // Converts in to mm (2, 5, 10)
        double[] values = {2, 5, 10};
        for(int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " inches in MM is " + inToMm(values[i]) + " MM");
        }

        // Finds the circumference of a circle with a radius of 3.2 inches
        double radius = 3.2;
        System.out.println("The circumference of a circle with a radius of " + radius + " inches is " + circumference(radius) + " inches");
        */
    }
}
