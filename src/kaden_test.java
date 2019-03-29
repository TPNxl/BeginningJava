public class kaden_test {
    public static final int Size = 4;

    public static void main(String[] args) {
        Up();
    }
    public static void lineMethod()
    {
        System.out.println();
    }
    public static void Up()
    {
        for (int counter = 1; counter <= Size; counter++)
        {
            System.out.print("|");

            for(int space = 1; space <= -counter+Size; space++)

            {
                System.out.print(" ");
            }


            System.out.print("/");
            for(int space = 1; space < counter; space++){
                System.out.print("/");
            }
            System.out.print("\\");
            for(int space = 1; space <= -counter+Size; space++)
            {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}