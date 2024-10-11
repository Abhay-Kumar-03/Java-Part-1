import java.util.Scanner;

public class NumIsPosOrNegOrZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        long num = input.nextLong();

        if(num < 0){
            System.out.println("Your number is Negative");
        }
        else if(num == 0){
            System.out.println("Your number is Zero");
        }
        else{
            System.out.println("Your Number is Positive");
        }
    }
}
