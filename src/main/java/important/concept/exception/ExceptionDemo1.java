package important.concept.exception;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c;
        System.out.println("I am first SOP in main");

        c=a/b;
       // throw new Exception();
        try {
            throw new NullPointerException();
        }
        catch (Exception ex){
            System.out.println(ex);
        }

        System.out.println("I am last SOP in main");
    }
}
