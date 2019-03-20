package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
        app.connect("35.242.146.67:3306");
    }

    @Test
    void testGetEmployee()
    {
        Employee emp = app.getEmployee("255530");
        assertEquals(emp.emp_no, 255530);
        assertEquals(emp.first_name, "Ronghao");
        assertEquals(emp.last_name, "Garigliano");
    }

    @Test
    void testAddEmployee()
    {
        Employee emp = new Employee();
        emp.emp_no = 500001;
        emp.first_name = "Kevin";
        emp.last_name = "Chalmers";
        app.addEmployee(emp);
        emp = app.getEmployee("500001");
        assertEquals(emp.emp_no, 500001);
        assertEquals(emp.first_name, "Kevin");
        assertEquals(emp.last_name, "Chalmers");
    }
}