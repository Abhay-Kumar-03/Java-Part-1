import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Year: ");
        int year = input.nextInt();

        if( year%400==0 || (year%4==0 && year%100!=0) ){
            System.out.println("Your year is a Leap Year");
        }
        else{
            System.out.println("Your year is not a Leap Year");
        }
    }
}
