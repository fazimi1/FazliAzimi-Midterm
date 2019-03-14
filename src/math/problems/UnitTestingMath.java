package math.problems;

import org.testng.Assert;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        Assert.assertEquals(Factorial.multiplyNum(5),120);
        System.out.println("Unit testing Succeeded");
        int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
        Assert.assertEquals(LowestNumber.getMinValue(array),5);
        System.out.println("Unit testing Succeeded");
    }
}
