package week2;

import java.util.ArrayList;
import java.util.HashMap;

public class Friday {
    public static String letter(double score){
        String out="";
        if (score>=90){
            out="A";
        } else if(score>=80 && score<90){//&& is and || is or
            out="B";
        } else if(score>=70){
            out="C";
        } else if(score>=60){
            out="D";
        } else {
            out="F";
        }
        return out;
    }
    public static void main(String[] args) {
        int val=10;
        while (val>0){
            System.out.println(val);
            val-=1;
        }
         val=10;
        for (;val>0;){
            System.out.println(val);
            val-=1;
        }
        for (int x=10; x>0;x-=1){
            System.out.println(x);
        }
        ArrayList<Integer> arr1=new ArrayList<>();
        for (int x=0;x<4;x++){
            arr1.add(x);
        }
        ArrayList<Integer> arr2=arr1;
        System.out.println(arr1);
        for (int x=0;x<arr1.size();x++){
            System.out.println(arr1.get(x));
        }
        HashMap<String,Integer> bills=new HashMap<>();
        bills.put("Alllen",17);
        bills.put("Cook",4);
        for (String name : bills.keySet()){
            System.out.println(name+": "+bills.get(name));
        }
        for (Integer num : bills.values()){
            System.out.println(num);
        }
    }
}
