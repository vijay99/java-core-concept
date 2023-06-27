package important.concept.javaeight;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args)  {
        Optional<String> myOptional = Optional.of("Hello,World");
        Optional<Object> objectOptional =Optional.of(new Object());
        Optional<Object> emptyOptional = Optional.empty();

        System.out.println("emptyOptional is :"+emptyOptional.isPresent());
        System.out.println("myOptional is :"+myOptional.isPresent());
        System.out.println("myOptional get():"+myOptional.get());
        System.out.println("emptyOptional orElse():"+emptyOptional.orElse("This is default value"));
        System.out.println("emptyOptional orElseGet():"+emptyOptional.orElseGet(() -> "I am orElseGet() method"));
        System.out.println("emptyOptional orElseThrow():"+emptyOptional.orElseThrow(() -> new NullPointerException("I am NPE")));
    }
}
