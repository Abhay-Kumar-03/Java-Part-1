import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
        int checkPal = checkPalindrome(num);
        if(checkPal == num){
            System.out.println("It is an Palindrome Number");
        } else{
            System.out.println("It is not and Palindrome Number");
        }

    }

    public static int checkPalindrome(int num){
        int rem = 0;
        int ans = 0;
        while(num > 0){
            rem = num % 10;
            ans = ans*10 + rem;
            num /= 10;
        }
        return ans;
    }

}
