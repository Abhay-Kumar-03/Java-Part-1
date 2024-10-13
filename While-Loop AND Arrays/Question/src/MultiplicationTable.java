import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
        printMultiplicationTable(num);
    }

    public static void printMultiplicationTable(int num){
        int i=1;
        while(i <= 10){
            System.out.println(num +" * " + i + " = " + (num * i));
            i++;
        }
    }

}