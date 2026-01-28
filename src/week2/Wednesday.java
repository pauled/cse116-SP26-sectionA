package week2;

public class Wednesday {
    public static int multiplyBy2(int valIn){
        int temp=valIn*2;
        return temp;
    }

    public static void main(String[] args) {
        System.out.println("wow, I printed!");
        int aNum=5;
        double aDouble=5.6;
        String str1="a string";
        boolean bool=true;
        aNum=6/4;
        System.out.println("I am aNum: "+aNum);
        aNum=aNum << 2;
        aNum*=4;
        System.out.println(aNum);
        int out=multiplyBy2(4);
    }
}
