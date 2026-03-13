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
    public void testAddPositivesBiggerFirst(){
        ArrayList<TestAddHelper> tests=new ArrayList<>();
        tests.add(new TestAddHelper(6,3,9));
        tests.add(new TestAddHelper(4,4,8));

        for (TestAddHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testAddPositivesBiggerSecond(){
        ArrayList<TestAddHelper> tests=new ArrayList<>();
        tests.add(new TestAddHelper(1,2,3));
        tests.add(new TestAddHelper(2,5,7));

        for (TestAddHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testAddPositivesEqual(){
        ArrayList<TestAddHelper> tests=new ArrayList<>();
        tests.add(new TestAddHelper(2,2,4));
        tests.add(new TestAddHelper(5,5,10));

        for (TestAddHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testAddNegativesNegativeFirstPositiveResult(){
        ArrayList<TestAddHelper> tests=new ArrayList<>();
        tests.add(new TestAddHelper(-5,12,7));
        tests.add(new TestAddHelper(-2,5,3));

        for (TestAddHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testAddNegativesNagativeSecondPositiveResult(){
        ArrayList<TestAddHelper> tests=new ArrayList<>();
        tests.add(new TestAddHelper(5,-2,3));
        tests.add(new TestAddHelper(12,-5,7));

        for (TestAddHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testAddNegativesNegativeFirstPositionNegativeResult(){
        ArrayList<TestAddHelper> tests=new ArrayList<>();
        tests.add(new TestAddHelper(-10,2,-8));
        tests.add(new TestAddHelper(-2,1,-1));

        for (TestAddHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testAddNegativesNegativeSecondPositionNegativeResult(){
        ArrayList<TestAddHelper> tests=new ArrayList<>();
        tests.add(new TestAddHelper(1,-2,-1));
        tests.add(new TestAddHelper(2,-5,-3));

        for (TestAddHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testAddNegativesBothNegativeSmallerFirst(){
        ArrayList<TestAddHelper> tests=new ArrayList<>();
        tests.add(new TestAddHelper(-10,-2,-12));
        tests.add(new TestAddHelper(-12,-5,-17));

        for (TestAddHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testAddNegativesBothNegativeSmallerSecond(){
        ArrayList<TestAddHelper> tests=new ArrayList<>();
        tests.add(new TestAddHelper(-1,-2,-3));
        tests.add(new TestAddHelper(-2,-5,-8));

        for (TestAddHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testAddNegativesZeroResults(){
        ArrayList<TestAddHelper> tests=new ArrayList<>();
        tests.add(new TestAddHelper(2,-2,0));
        tests.add(new TestAddHelper(-5,5,0));

        for (TestAddHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testAddZerosZeroFirst(){
        ArrayList<TestAddHelper> tests=new ArrayList<>();
        tests.add(new TestAddHelper(0,-2,-2));
        tests.add(new TestAddHelper(0,-5,-5));
        tests.add(new TestAddHelper(0,3,3));
        tests.add(new TestAddHelper(0,9,9));

        for (TestAddHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testAddZerosZeroSecond(){
        ArrayList<TestAddHelper> tests=new ArrayList<>();
        tests.add(new TestAddHelper(-2,0,-2));
        tests.add(new TestAddHelper(-5,0,-5));
        tests.add(new TestAddHelper(3,0,3));
        tests.add(new TestAddHelper(9,0,9));

        for (TestAddHelper test : tests){
            test.runTest();
        }
    }
    @Test
    public void testAddValueTwice(){
        ArrayList<TestAddHelper> tests=new ArrayList<>();
        tests.add(new TestAddHelper(-2,-2,-4));
        tests.add(new TestAddHelper(0,0,0));
        tests.add(new TestAddHelper(3,3,6));

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

    /*public static void main(String[] args) {
        String a="hello ";
        String b="goodbye";
        String c=a+b;
        System.out.println(c);
        System.out.println(c=="hello goodbye");
    }*/

}
