package parser;

import org.testng.Assert;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        Student student = new Student("James", "Roberts", "80", "12345");


        try{
            Assert.assertEquals(student.getFirstName(),"James");
            System.out.println("Pass");
        }catch ( AssertionError as){
            System.out.println("Fail");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }


        try{
            Assert.assertEquals(student.getLastName(),"Roberts");
            System.out.println("Pass");
        }catch (AssertionError as){
            System.out.println("Fail");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }


        try{
            Assert.assertEquals(student.getScore(),"80");
            System.out.println("Pass");
        }catch (AssertionError as){
            System.out.println("Fail");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }


        try{
            Assert.assertEquals(student.getId(),"12345");
            System.out.println("Pass");
        }catch (AssertionError as){
            System.out.println("Fail");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

    }
}

