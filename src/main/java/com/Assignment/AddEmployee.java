package com.Assignment;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {

    private static Employee e;
    List<Employee> list = new ArrayList<>();



    void addEmploye(Employee emp) {
        list.add(emp);
//        System.out.println(emp);
    }

    Employee getEmployee(int id) {
        for (Employee l : list) {
            Employee data = l;
            if (data.getId() == id) {
                return l;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        AddEmployee addEmp = new AddEmployee();
        addEmp.addEmploye(new Employee(1, "DK", "Hassan"));
        addEmp.addEmploye(new Employee(2, "kruthi", "crp"));
        System.out.println(addEmp.getEmployee(1));

    }
}
