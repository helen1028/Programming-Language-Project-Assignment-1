import java.util.Scanner;

class ifInputStatement{

    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Hi! Do you like dogs(reply with yes or no)? ");
        String yn = scan.nextLine();
        if(yn == "yes"){
            System.out.println("Oh, I like dogs too, but I like cats more!");
        }
        else {
            System.out.println("I like dogs, but I like cats more");
        }
        scan.close();
    }
}

