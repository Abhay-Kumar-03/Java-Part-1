import java.util.Scanner;

public class ReverseTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int numReverse = numReverse(num);
        System.out.println("Reverse of the given number is: " + numReverse );
    }

    public static int numReverse(int num){
        int newNum = 0;
        int rem = 0;
        while(num > 0){
            rem = num % 10;
            newNum = newNum * 10 + rem;
            num /=10;
        }
        return newNum;
    }

}
