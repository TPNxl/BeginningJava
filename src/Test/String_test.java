package Test;

public class String_test {
    public static void main(String[] args) {
        String s1 = "Stuart Reges";
        String s2 = "Marty Stepp";
        System.out.println(s1.length());

        System.out.println(s1.indexOf("e"));

        System.out.println(s1.substring(7, 10));

        String s3 = s2.substring(1, 7);

        System.out.println(s3.toLowerCase());
    }
}
