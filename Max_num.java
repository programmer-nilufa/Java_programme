public class Max_num {
    public static void main(String[] args) {
        int[] nums = {4,6,7,2};
        int max = nums[0];
        for (int i = 1; i<nums.length; i++){
            if (nums[i] > max ){
                max = nums[i];
            }
        }
        System.out.println("The Maximum number is:" + max);
    }
}
