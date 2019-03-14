package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        String str1 = "Human brain is a biological learning machine";
       Assert.assertEquals(DetermineLargestWord.findTheLargestWord(str1),"biological");
        System.out.println("Determine largest value unit test Passed.");

        Assert.assertEquals(Anagram.isAnagram("mary", "army"), true);
        System.out.println(" unit test Passed.");


    }
}
