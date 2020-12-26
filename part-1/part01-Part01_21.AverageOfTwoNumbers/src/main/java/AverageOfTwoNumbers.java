
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        double n1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        double n2 = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + (n1+n2)/2);

    }
}
