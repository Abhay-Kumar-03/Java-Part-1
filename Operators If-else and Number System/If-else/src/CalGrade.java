import java.util.Scanner;

public class CalGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Percentage: ");
        int percentage = input.nextInt();

        if(percentage >= 90){
            System.out.println("Your garde is: A");
        }
        else if(percentage >= 75){
            System.out.println("Your grade is: B");
        }
        else if(percentage >= 60){
            System.out.println("Your grade is: C, work hard next time");
        }
        else if(percentage >=35){
            System.out.println("Your grade is: D, Need Improvement");
        }
        else{
            System.out.println("Sorry, you have failed");
        }
    }
}
