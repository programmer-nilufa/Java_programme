public class isPalindrome {
    public static boolean palindrome_num (int num)
    {
        int original = num;
        int rev = 0;
        while (num > 0)
        {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev == original;
    }

    public static void main(String[] args) {
        int num = 122;
        System.out.println("Is Palindrom: " + palindrome_num(num));
    }
}
