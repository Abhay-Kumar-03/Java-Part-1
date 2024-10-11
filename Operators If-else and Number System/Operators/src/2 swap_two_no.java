import java.util.Scanner;

 class swap_two_no {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Swapping Station");
        System.out.print("Enter Value of A: ");
        int a = input.nextInt();
        System.out.print("Enter Value of B: ");
        int b  = input.nextInt();

        int c = a;
        a = b;
        b = a;

        System.out.println("Swapping Done...");
        System.out.println("Value of A is: " + a);
        System.out.println("Value of B is: " + b);
    }
}