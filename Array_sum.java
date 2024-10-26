public class Array_sum {
    public static void main(String[] args) {
        int[] nums = {3,5,2};
        int sum = 0;
        for (int i = 1; i<=nums.length+1; i++){
            sum+=i;
            System.out.println(sum);
        }

    }
}
