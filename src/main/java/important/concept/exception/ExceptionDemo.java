package important.concept.exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;
        System.out.println("I am the first SOP in main");
        try {
            c = a / b;
            System.out.println("c is :" + c);
        }
        catch (NullPointerException ex){
            System.out.println(ex);
        }
        catch (RuntimeException rex){
            System.out.println(rex);
        }

        System.out.println("I am the Last SOP in main");
    }
}
