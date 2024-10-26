import java.util.Scanner;

public class User_max {
    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);

        System.out.println("Enter four numbers:");
        int num1 = nums.nextInt();
        int num2 = nums.nextInt();
        int num3 = nums.nextInt();
        int num4 = nums.nextInt();

        int max = (num1 > num2) ? (num1 > num3 ? (num1 > num4 ? num1 : num4) : (num3 > num4 ? num3 : num4)) :
                (num2 > num3 ? (num2 > num4 ? num2 : num4) : (num3 > num4 ? num3 : num4));

        System.out.println("The maximum number is =" + max);
    }
}
