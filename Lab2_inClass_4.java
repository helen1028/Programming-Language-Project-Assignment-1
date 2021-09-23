import java.util.Scanner;

class dating{

    public static void main(String [] args){

        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome, What's your name?: ");
        String fn = scan.nextLine();
        System.out.println("Nice to meet you, " + fn);
        System.out.println("Hello " + fn +", Please insert your age.");
        int first_age = scan.nextInt();
        System.out.println("What's the age of the person you want to date?");
        int date_age = scan.nextInt();

        if (date_age <= ((first_age/2 )+7)){
            System.out.println("Sorry, this person is too young for you.");
        }
        if (date_age >= ((first_age-7)*2)){
            System.out.println("Sorry, this person is too old for you.");
        }
        else{
            System.out.println("Congradulations! Your age is suitable for dating!");
        }
        scan.close();
    }
}
