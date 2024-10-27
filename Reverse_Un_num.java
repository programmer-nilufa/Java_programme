import java.util.Scanner;
public class Reverse_Un_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take a number as input from the user
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();

        // Reverse the number
        String reversedNumber = new StringBuilder(number).reverse().toString();

        // Show the output
        System.out.println("The reversed number is: " + reversedNumber);

        scanner.close();
    }
}
