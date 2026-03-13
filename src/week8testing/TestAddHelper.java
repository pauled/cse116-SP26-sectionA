package week8testing;
import static org.junit.Assert.assertEquals;

public class TestAddHelper {
    private int input1;
    private int input2;
    private int expected;

    public TestAddHelper(int in1,int in2,int expected){
        this.input1=in1;
        this.input2=in2;
        this.expected=expected;
    }

    public void runTest(){
        int actual=CodeToTest.add(this.input1,this.input2);
        String message=""+this.expected+"==add(";
        message+=input1+","+input2+")";
        assertEquals(message,expected,actual);
/*
        actual=CodeToTest.add(this.input2,this.input1);
        message=""+this.expected+"==add(";
        message+=input2+","+input1+")";
        assertEquals(message,expected,actual);*/
    }
}
