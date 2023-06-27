package important.concept.exception;

public class CustomException{
    public static void main(String[] args) {
        try {
            throw new MyCustomException("This is for testing of custom message");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println("I am last SOP in main");
    }

}


class MyCustomException extends RuntimeException{
    private String exceptionMessage;

    MyCustomException(String exceptionMessage){
        super(exceptionMessage);
    }
}
