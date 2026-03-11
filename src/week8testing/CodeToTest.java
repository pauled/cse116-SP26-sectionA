package week8testing;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CodeToTest {
    public static int add(int a, int b){
        return a+Math.abs(b);
    }
    @Test
    public void testAddPositives(){
        ArrayList<TestAddHelper> tests=new ArrayList<>();
        tests.add(new TestAddHelper(1,2,3));
        tests.add(new TestAddHelper(2,5,7));
        tests.add(new TestAddHelper(6,3,9));
        tests.add(new TestAddHelper(4,4,8));

        for (TestAddHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testAddNegatives(){
        ArrayList<TestAddHelper> tests=new ArrayList<>();
        tests.add(new TestAddHelper(1,-2,-1));
        tests.add(new TestAddHelper(2,-5,-3));
        tests.add(new TestAddHelper(6,-3,3));
        tests.add(new TestAddHelper(4,-4,0));
        tests.add(new TestAddHelper(-1,-2,-3));
        tests.add(new TestAddHelper(-7,-5,-12));

        for (TestAddHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testAddZeros(){
        ArrayList<TestAddHelper> tests=new ArrayList<>();
        tests.add(new TestAddHelper(0,-2,-2));
        tests.add(new TestAddHelper(0,-5,-5));
        tests.add(new TestAddHelper(0,3,3));
        tests.add(new TestAddHelper(0,9,9));
        tests.add(new TestAddHelper(0,0,0));

        for (TestAddHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void Problems(){
        double total=0;
        for (int x=0;x<100;x++){
            total+=.1;
        }
        assertEquals(10,total,.001);
        String temp="this";
        assertEquals("this",temp);
    }


}
