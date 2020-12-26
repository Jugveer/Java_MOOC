
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        
        while(true) {
            System.out.println("Give a number: ");
            double userInput = Double.valueOf(scanner.nextLine());
        
            if(userInput > 0 || userInput < 0) {
                sum = sum + userInput;
                count = count + 1;
            }
                
            if (userInput == 0){
                break;
            }
        }
        System.out.println("Average of the numbers: " + (sum/count));
    }
}
