
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int number = Integer.valueOf(scan.nextLine());
        if (number < 0) {
            System.out.println("impossible!");
        } else if (number < 50) {
            System.out.println("failed");
        } else if (number == (50-59)) {
                System.out.println("1");
            }
    }
}
