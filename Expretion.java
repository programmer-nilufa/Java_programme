public class Expretion {
    public static void main(String[] args) {
        int x = 7, y = 4, r = 3;

        //1. x+y-1+x^2
        int ex1 = x+y-1+(int)Math.pow(x,2);
        System.out.println("1. x+y-1+x^2 = "+ ex1);

        //2. x^2+Y^(r-2)
        int ex2 = (int)Math.pow(x,2) + (int)Math.pow(y,r-2);
        System.out.println("2. x^2+Y^(r-2) = "+ ex2);

        //3. x^2*Y^(r-2)
        int ex3 = (int)Math.pow(x,2) * (int)Math.pow(y,r-2);
        System.out.println("3. x^2+Y^(r-2) = "+ ex3);

        // 4. |x - y|
        int ex4 = Math.abs(x - y);
        System.out.println("4. |x - y| = " + ex4);

        // 5. (x/y) * x + (y/x) * x
        double ex5 = (double)x / y * x + (double)y / x * x;
        System.out.println("5. (x/y) * x + (y/x) * x = " + ex5);

        // 6. x^r / y - y^5
        double ex6 = (double)Math.pow(x, r) / y - (double)Math.pow(y, 5);
        System.out.println("6. x^r / y - y^5 = " + ex6);

        // 7. floor(x/y)
        int ex7 = (int)Math.floor((double)x / y);
        System.out.println("7. x/y = " + ex7);

        // 8. ceil(x/y)
        int ex8 = (int)Math.ceil((double)x / y);
        System.out.println("8. x/y = " + ex8);
    }
}
