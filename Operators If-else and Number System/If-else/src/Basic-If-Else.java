 class Main {
    public static void main(String[] args) {
        boolean isMale = true;
        String name = "Bob";
        System.out.println("Name before if is: ");

        if(isMale) {
            System.out.println("Mr." + name);
        } else {
            System.out.println("Mrs." + name);
        }
        System.out.println("After if is: ");
        System.out.println("\n");

        boolean isSeniorCitizen = true;
        boolean isAnAdult = false;

        if (isSeniorCitizen) {
            System.out.println("Hello Senior Citizen");
        }
        else if (isAnAdult) {
            System.out.println("Hello Adult");
        }
        else{
            System.out.println("Hello Child");
        }
        }
    }
