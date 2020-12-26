import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer = 0;
        System.out.println("First number?");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int lastNumber = Integer.valueOf(scanner.nextLine());
        
        for (int counter = firstNumber; counter <= lastNumber; counter++) {
            answer = counter + answer;
        }
        
        System.out.println("The sume is: " + answer);
    }
}