
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberCount = 0;
        double numberSum = 0;
        
        while (true) {
            Double userNumber = Double.valueOf(scanner.nextLine());
            
            if (userNumber == 0) {
                break;
            }
            
            if (userNumber > 0) {
                numberSum = userNumber + userNumber;
                numberCount = numberCount + 1;
            }
            else {
                System.out.println("Cannot calculate the average");
                break;
            }
        }
        System.out.println(numberSum/numberCount);
    }
}
