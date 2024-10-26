public class Min_num {
    public static void main(String[] args) {
        int[] nums = {8,6,4,9};
        int min = nums[0];
        for (int i = 1; i<nums.length; i++){
            if (nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println("The minimun number is : "+ min);
    }
}
