package week8testing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CodeToTest {
    public static int add(int a, int b){
        return a+b;
    }
    @Test
    public void testAdd(){
        assertEquals("3==add(1,2)",3,add(1,2));
        assertEquals("6==add(0,5)",6,add(0,5));
        assertEquals("3==add(-5,8)",3,add(-5,8));
        assertTrue(add(1,2)==3);
        assertTrue(add(0,5)==6);
        assertTrue(add(-5,8)==3);
    }

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(0,5));
        System.out.println(add(-5,8));
        if (add(1,2)==3){
            System.out.println("passed test add(1,2)==3");
        } else {
            System.out.println("failed test add(1,2)==3");
        }
    }
}
