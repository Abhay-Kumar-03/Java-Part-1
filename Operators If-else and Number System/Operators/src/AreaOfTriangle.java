import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Value Of Base: ");
        double base = input.nextDouble();
        System.out.println("Please Enter Value Of Height: ");
        double height = input.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("Area of Your Triangle is: " + area);
    }
}
