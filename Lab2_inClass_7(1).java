import java.util.Scanner;

class days{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year");
        int year = sc.nextInt();
        System.out.println("Please enter the month");
        int month = sc.nextInt();
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("There are 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("There are 30 days");
                break;
            case 2:
                if(year%400 == 0||year% 4 == 0&&year % 100!= 0){
                    System.out.println("29 days");
                }
                else{
                    System.out.println("28 days");
                }
                break;
                
        }
    }
}

