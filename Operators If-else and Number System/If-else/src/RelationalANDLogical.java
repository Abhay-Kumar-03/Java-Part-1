import java.util.Scanner;

public class RelationalANDLogical {
    public static void main(String[] args) {

//        // ---->> Relational
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter your Age: ");
//        int age = input.nextInt();
//
//        if(age >= 18){
//            System.out.println("You are eligible to Drive");
//        }
//        else{
//            System.out.println("Beta Cycle chalao");
//        }

        // ----->>> Logical
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your Age: ");
        int age = input.nextInt();
        System.out.print("Are you a Female? (True/False): ");
        boolean isFemale = input.hasNextBoolean();

        if(age < 5){
            System.out.println("You got 75% Discount");
        }
        else if (isFemale){
            System.out.println("You got 50% Discount");
        }
        else if (age > 60 && !isFemale){
            System.out.println("You got 25% Discount");
        }
        else{
            System.out.println("You did not get any Discount");
        }

    }
}
