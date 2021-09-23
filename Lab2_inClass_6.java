import java.util.Scanner;

class weather{
    public static void main (String [] args){

       Scanner scan = new Scanner(System.in);
       System.out.println("Welcome, What's your name?: ");
        String fn = scan.nextLine();
        System.out.println("Hi "+ fn + ", What's the weather today?(Pleace reply sunny/cloudy/raining/snowing)");
        String wt = scan.nextLine();
        if (wt == "cloudy" | wt == "raining"| wt == "snowing") {
            System.out.println("Can you stand cold weather?(yes/no)");
            String cold = scan.nextLine();
            if (cold =="yes"){
                System.out.println("I suggest you wear more than two clothes!");
            }
            else{
                System.out.println("Two or one dress is enough for you!");
            }
        }
        else{
            System.out.println("Can you stand hot weather?(yes/no)");
            String hot = scan.nextLine();
            if (hot =="no"){
                System.out.println("I suggest you wear a short vest and shorts.");
            }
            else{
                System.out.println("Although you can stand in hot weather, it is recommended to wear only one piece of clothing at most. If you wear too much, you will be prone to heatstroke.");
            }
        }
        scan.close();
       
    }
}