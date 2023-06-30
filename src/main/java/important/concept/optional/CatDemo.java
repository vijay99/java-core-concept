package important.concept.optional;

import java.util.Optional;

public class CatDemo {
    public static void main(String[] args) {
        Optional<Cat> optionalMyCat =findCatByName("pussy cat");
        /*if(myCat!=null) {
            System.out.println(myCat.getAge());
        }
        else{
            System.out.println(0);
        }*/



        /*if(optionalMyCat.isPresent()){
            System.out.println(optionalMyCat.get().getAge());
        }
        else {
            System.out.println(0);
        }*/

       // Cat myCat=optionalMyCat.orElse(new Cat("UNKNOWN",0));

       // System.out.println(myCat.getAge());
        optionalMyCat.map(Cat::getAge).orElse(0);
        System.out.println();

    }

    private static Optional<Cat> findCatByName(String pussy_cat) {

        Cat retrieveCat=new Cat(pussy_cat,4);

        return Optional.ofNullable(null);
    }
}
