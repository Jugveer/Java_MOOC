
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCount = 0;
        int numberSum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int userNumber = Integer.valueOf(scanner.nextLine());
            
            if (userNumber == 0) {
                break;
            }
            if (userNumber == userNumber) {
                numberCount = numberCount + 1;
            }
            if (userNumber == userNumber) {
                numberSum = userNumber + numberSum;
            }
        }
        System.out.println("Number of numbers: " + numberCount);
        System.out.println("Sum of the numbers: " + numberSum);
    }
}
