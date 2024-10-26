import java.util.Scanner;
public class Ary_serc {
    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = nums.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = nums.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        System.out.println("The sum of the array elements is: " + sum);
    }
}
