package important.concept.javaeight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {

        List<Employee> listEmployee = new ArrayList<>();
        listEmployee.add(new Employee("Amit","Loadha"));
        listEmployee.add(new Employee("Vineet","Kumar"));
        listEmployee.add(new Employee("Pankaj","Tripathi"));
        listEmployee.add(new Employee("Rishi","li"));

        //getting all Employee who's last name length is greater then 5
        List<Employee> sortedEmplist=listEmployee.stream().filter(employee -> employee.getLastName().length()>5).collect(Collectors.toList());
        System.out.println(sortedEmplist);

        //get List of first name for Employes who's last name greater then 5
        List<String> firstNameList=listEmployee.stream().filter(e -> e.getLastName().length()>5).map(employee -> employee.getFirstName()).collect(Collectors.toList());

        System.out.println(firstNameList);
    }
}


class Employee {
    private String firstName;
    private String lastName;

    Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
