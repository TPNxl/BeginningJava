package TextTest;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AveragePrice {
    public static void print(String input) { System.out.print(input);}
    public static void main( String[] args) throws IOException {
        File file = new File("C:\\Users\\timmy\\Documents\\GitHub\\BeginningJava\\src\\TextTest\\shopping.txt");
        Scanner f = new Scanner(file);
        while(f.hasNextLine() && f.hasNext()) {
            Scanner item = new Scanner(f.nextLine());
            String nameOfItem = item.next();
            double average = 0.0;
            int i = 0;
            boolean validPrice = true;
            if(!(item.hasNextDouble())) {
                validPrice = false;
            }
            while(item.hasNextDouble()) {
                average+=item.nextDouble();
                i++;
            }
            item.close();
            average/=i;
            if(!validPrice) {
                System.out.print("No prices listed for "+nameOfItem);
            } else {
                System.out.printf("The average price of %-8s is $%.2f\n", nameOfItem, average);
            }
        }
        f.close();
    }
}
