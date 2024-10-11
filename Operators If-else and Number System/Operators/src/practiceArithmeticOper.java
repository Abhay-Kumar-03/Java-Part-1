import java.util.Scanner;

public class practiceArithmeticOper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your First Number: ");
        int firstNum = input.nextInt();
        System.out.print("Please Enter Your Second Number: ");
        int secondNum = input.nextInt();

        int add = firstNum + secondNum;
        int sub = firstNum - secondNum;
        int mul = firstNum * secondNum;
        int div = firstNum / secondNum;
        int mod = firstNum % secondNum;

        System.out.println("Addition is: " + add);
        System.out.println("Subtraction is: " + sub);
        System.out.println("Multiplication is: " + mul);
        System.out.println("Divide is: " + div);
        System.out.println("Modulus is: " + mod);
    }
}