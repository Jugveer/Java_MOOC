import java.util.Scanner;
 
public class SumOfASequence {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int answer = 0;
 
        System.out.println("Last number?");
        int n = Integer.valueOf(scanner.nextLine());
 
        for (int counter = 0; counter <= n; counter++) {
            answer = answer + counter;
        }
 
        System.out.println("The sum is " + answer);
    }
}