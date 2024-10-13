import java.util.Scanner;

public class Parameter {
    public static void main(String[] args) {
//        int num = sumTwoNumbers(7, 9);
//        System.out.println(num);
        System.out.println(sumTwoNumbers(7, 8));
        System.out.println(sumTwoNumbers(90, 28));
        System.out.println(sumTwoNumbers(39, 65));
    }

    public static int sumTwoNumbers(int first, int second){
        System.out.println("First Number is: " + first);
        System.out.println("Second Number is: " + second);
        return first + second;
    }

}
