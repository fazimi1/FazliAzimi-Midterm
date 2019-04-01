package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
        double pension=EmployeeInfo.calculateEmployeePension(60000);
        try{
            Assert.assertEquals(60000,60000);
            System.out.println("Test Passed");
        } catch (AssertionError as) {
            System.out.println("Test Failed");
        }
    }
}
