
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCount = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            if (number == number) {
                numberCount = numberCount + 1;
            }
        }
        System.out.println("Number of numbers: " + numberCount);
    }
}
