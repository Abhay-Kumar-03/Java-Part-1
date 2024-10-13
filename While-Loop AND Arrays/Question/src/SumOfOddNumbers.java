import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Last Number: ");
        int lastNum = input.nextInt();
        int sum = SumOfOddNumbers(lastNum);
        System.out.println("Sum of Odd Numbers till " + lastNum + " is " + sum);

    }

    public static int SumOfOddNumbers(int lastNum){
        int sum = 0;
        int i = 1;
        while(i <= lastNum){
            sum += i;
            i +=2;
        }
        return sum;
    }


}
