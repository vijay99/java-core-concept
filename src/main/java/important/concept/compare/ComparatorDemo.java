package important.concept.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {

        Employee emp1 = new Employee(11,"IT","SE");
        Employee emp2 = new Employee(2,"CS","TESTER");
        Employee emp3 = new Employee(3,"ARCH","MANAGER");
        Employee emp4 = new Employee(1,"OFFICEBOY","WORKER");
        Employee emp5 = new Employee(23,"REPO","WORKER");

        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        System.out.println("Employees by sorted id:");
        Collections.sort(empList,new EmpIdComparator());
        System.out.println(empList );

        System.out.println("Employees by sorted dept:");
        Collections.sort(empList,new EmpNameComparator());
        System.out.println(empList);


    }
}

class Employee {
    private int id;
    private String dept;
    private String role;

    public Employee(int id, String dept, String role) {
        this.id = id;
        this.dept = dept;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getDept() {
        return dept;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", dept='" + dept + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

class EmpIdComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2) {
        if(emp1.getId()==emp2.getId())
            return 0;
        else if(emp1.getId()>emp2.getId())
            return 1;
        else
            return -1;
    }
}

class EmpNameComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee employee1 ,Employee employee2){
        return employee1.getDept().compareTo(employee2.getDept());
    }
}
