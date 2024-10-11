import java.util.Scanner;

public class BitwiseOper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Number: ");
        int first = input.nextInt();
        System.out.print("Enter Your Second Number: ");
        int second = input.nextInt();

        //---->> AND
        int result1 = first & second;
        System.out.println("Result is: " + result1);

        //----->> OR
        int result2 = first | second;
        System.out.println("Result is: " + result2);

        //----->> XOR
        int result3 = first ^ second;
        System.out.println("Result is: " + result3);

        //----->> NOT
        int result4 = ~first;
        System.out.println("Result is: " + result4);
    }
}
