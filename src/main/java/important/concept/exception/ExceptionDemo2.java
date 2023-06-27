package important.concept.exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c=-1;

        System.out.println("I am first SOP in main()");

        try {
             c = calculateValueOfC(a, b);
        }
        catch (ArithmeticException arithmeticException){
            System.out.println("There was ArithmeticException occurred");
        }
        System.out.println("C is :"+c);
        System.out.println("I am last SOP in main()");
    }

    private static int calculateValueOfC(int a, int b) {
        System.out.println("I am first SOP in calculateValueOfC() ");
        int d;
        d= a/b;
        return d;
    }
}
