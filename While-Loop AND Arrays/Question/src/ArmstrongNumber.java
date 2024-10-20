import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num = input.nextInt();
        int Armstrong = checkArmstrong(num);
        if(Armstrong == num){
            System.out.println("This is a Armstrong NUmber");
        } else{
            System.out.println("This is a Normal NUmber not an Armstrong Number");
        }
    }

    public static int checkCount(int num){
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }


    public static int checkArmstrong(int num){
        int newNum = num;
        int rem = 0;
        int ans = 0;
        int count = checkCount(num);

        while(newNum >0 ){
            rem = newNum % 10;
            ans += Math.pow((rem), count);
            newNum /= 10;
        }
        return ans;
    }

}
