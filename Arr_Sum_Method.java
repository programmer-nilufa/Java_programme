public class Arr_Sum_Method {
    // Method to calculate the sum of array elements
    public static int sum(int[] array) {
        int sum = 0;
        for (int i: array) {
            sum += i;
        }
        return sum;
    }

    // Main method
    public static void main(String[] args) {
        int[] array = {2, 3, 5}; // Example array
        System.out.println(sum(array)); // Call the static method sum
    }
}
