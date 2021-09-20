package com.Assignment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyObject;

class AddEmployeeTest {


    @Mock
    private AddEmployee addEmployee;

    @BeforeEach
    public void init() {
        addEmployee = Mockito.mock(AddEmployee.class);
    }

    @Test
    void addEmploye() {
        Employee e = new Employee(3, "Sudhi", "bangalore");
        AddEmployee add = new AddEmployee();
        add.addEmploye(e);
        Mockito.doNothing().when(addEmployee).addEmploye(anyObject());
        addEmployee.addEmploye(e);
        Mockito.verify(addEmployee, Mockito.times(1)).addEmploye(e);
    }

    @Test
    void getEmployee() {
        Employee e = new Employee(3, "Sudhi", "bangalore");
        AddEmployee add = new AddEmployee();
        add.addEmploye(e);
        Employee data = add.getEmployee(3);
        Assertions.assertEquals(e, data);
    }
}