package important.concept.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        Person person1 = new Person(10,"Sumit");
        Person person2 = new Person(12,"Bicky");
        Person person3 = new Person(5,"Amit");
        Person person4 = new Person(16,"Zmit");
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        System.out.println(personList);



        Collections.sort(personList);

        System.out.println("After sorting by age");
        System.out.println(personList);


    }
}

class Person implements Comparable<Person>{
    int age;
    String name;

    Person(int age,String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public int compareTo(Person person) {
         if(age==person.age)
             return 0;
         else if(age> person.age)
             return 1;
         else
             return -1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
