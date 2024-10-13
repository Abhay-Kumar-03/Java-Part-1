import java.util.Scanner;

public class ReturnFunctions {
    public static void main(String[] args) {
        int first = readNum();
        int second = readNum();

        int sum = first + second;
        System.out.println("Sum of Given Numbers: " + sum);
    }

    public static int readNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number");
        int number = input.nextInt();
        return number;
    }

}
