public class Array_large {
    public static int large_num (int[] array)
    {
        int large = array[0];
        for (int num:array)
        {
            if (num > large)
                large = num;
        }
        return large;
    }

    public static void main(String[] args) {
        int[] num = {2,9,4};
        System.out.println("Largest number is: " + large_num(num));
    }
}
