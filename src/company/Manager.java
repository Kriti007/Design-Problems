package company;

import java.util.LinkedList;
import java.util.List;

public class Manager extends Employee {
    List<Employee> EmployeeList = new LinkedList<>();

    private void addEmployee(Employee employee){
        this.EmployeeList.add(employee); //add leaf node
    }

}
