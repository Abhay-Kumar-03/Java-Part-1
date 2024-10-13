public class Function {
    public static void main(String[] args) {
        System.out.println("Good Night from Abhay");
        greetUser();
        System.out.println("\n");
        printFirstPatter();
        System.out.println("\n");
        printSecondPattern();
    }

    public static void greetUser() {
        System.out.println("Good Morning from Abhay");
    }

    public static void printFirstPatter(){
        int rows = 0;
        while(rows < 5){
            System.out.print("*");
            int i = 0;
            while(i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

    public static void printSecondPattern(){
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }

}
