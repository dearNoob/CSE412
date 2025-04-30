/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.unisttesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class UnistTestingTest {
    

public  UnistTestingTest(){
    
}
@Test 
public void testMain(){
    int a= 10;
    int b= 5;
    int expected_output =15;
    UnistTesting Test = new UnistTesting();
    int acctualOutput = Test.sum(a,b);
    assertEquals(expected_output, expected_output);
    
}
@Test 
public void subs(){
    int a= 10;
    int b= 5;
    int expected_output =15;
    UnistTesting Test = new UnistTesting();
    int acctualOutput = Test.subs(a,b);
    assertEquals(expected_output, expected_output);
    
}
@Test 
public void multiply(){
    int a= 10;
    int b= 5;
    int expected_output =15;
    UnistTesting Test = new UnistTesting();
    int acctualOutput = Test.multi(a,b);
    assertEquals(expected_output, expected_output);
}

    
@Test
    public void calculateSalary(){
        int workingHour = 40;
        boolean weekday = true;
        int expectedOutput =4000;
        UnistTesting test = new UnistTesting();
        int actualResult = test.calculateSalary(workingHour, weekday);
        
    }
    
}
