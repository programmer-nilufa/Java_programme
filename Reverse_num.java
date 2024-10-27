import java.util.Scanner;
public class Reverse_num {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Take a three-digit number as input from the user
            System.out.print("Enter a three-digit number: ");
            String number = scanner.nextLine();

            // Check if the input is a three-digit number
            if (number.matches("\\d{3}")) {
                // Reverse the number
                String reversedNumber = new StringBuilder(number).reverse().toString();
                System.out.println("The reversed number is: " + reversedNumber);
            }
            else {
                System.out.println("Please enter a valid three-digit number.");
            }

            scanner.close();
        }

}
