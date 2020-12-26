
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        double amount = Integer.valueOf(scan.nextLine());
        //int taxLimit = 0;
        

        if (amount < 5000) {
            System.out.println("No tax!");
        } else if ( amount >= 5000 && amount < 25000 ) {
            System.out.println("Tax:" + (amount-100)*0.08);
        }else if ( amount >= 25000 && amount < 55000 ) {
            System.out.println("Tax:" + (amount-1700)*0.1);
        }else if ( amount >= 55000 && amount < 200000 ) {
            System.out.println("Tax:" + (amount-4700)*0.12);
        }else if ( amount >= 200000 && amount < 1000000 ) {
            System.out.println("Tax:" + (amount-22100)*0.15);
        }else{
            System.out.println("Tax:" + (amount-142100)*0.17);
        }
    }
}
