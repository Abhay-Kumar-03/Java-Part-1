import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your First Number: ");
        int first = input.nextInt();
        System.out.print("Enter your second Number: ");
        int second = input.nextInt();
        int lcm = lcm(first, second);
        System.out.println("LCM of two numbers is: " + lcm);
    }

    public static int lcm(int first, int second){
        int i = 1;
        while(true){
            int factor = first * i;
            if(factor % second == 0){
                return factor;
            }
            i++;
        }
    }
}
