
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        int factorial = 1;

        System.out.println("Give number: ");
        int number = Integer.parseInt(scanner.nextLine());

        while (i <= number) {
            factorial = factorial * i;
            i++;   
        }
        System.out.println("Answer is " + factorial);
    }
}