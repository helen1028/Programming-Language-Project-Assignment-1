import java.util.Scanner;

class temperatures{
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Hey, what's the temperature now? ");
        int tm = scan.nextInt();
        if(tm >= 90){
            System.out.println("Stay cool, it’s hot out!");
        }
        if(tm >= 70 && tm <= 89){
            System.out.println("A little warm, but nice");
        }
        if(tm >= 50 && tm <= 69){
            System.out.println("Nice weather we’ve been having, huh?");
        }
        if(tm >= 33 && tm <= 50){
            System.out.println("Been chilly lately, huh?");
        }
        if(tm <= 32){
            System.out.println("Brrr!! It’s cold!");
        }
        scan.close();
    }
}
