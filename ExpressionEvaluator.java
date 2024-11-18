import java.util.Scanner;
public class ExpressionEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter values for a, b, c, x, y and z: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int i = a;
        int j = b;

        int result1 = ++a * b-- - --c / 2;
        System.out.println("Result of Expression 1 ( ++a * b-- - --c / 2 ): " + result1);

        int result2 = (++x * y-- + z - --i * j) / 2 + (x > y ? z : i);
        System.out.println("Result of Expression 2 ( (++x * y-- + z - --a * b) / 2 + (x > y ? z : a) ): " + result2);

        scanner.close();
    }
}
