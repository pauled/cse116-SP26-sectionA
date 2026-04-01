package week11efficiency;

import java.util.Random;

public class Sort {
    public static int[] bubbleSort(int[] out){
        boolean swap=true;
        while (swap){
            swap=false;

        }
    }
    public static int[] combine(int[] half1,int[] half2){
        int[] out=new int[half1.length+half2.length];
        int loc1=0;
        int loc2=0;
        int locOut=0;
        while (loc1<half1.length && loc2<half2.length){
            if (half1[loc1]<half2[loc2]){
                out[locOut]=half1[loc1];
                loc1++;
                locOut++;
            } else {
                out[locOut]=half2[loc2];
                loc2++;
                locOut++;
            }
        }
        while (loc1<half1.length){
            out[locOut]=half1[loc1];
            loc1++;
            locOut++;
        }
        while (loc2<half2.length){
            out[locOut]=half2[loc2];
            loc2++;
            locOut++;
        }
        return out;
    }
    public static int[] mergeSort(int[] data){
        if (data.length==1){
            return data;
        } else {
            int[] half1;
            int[] half2;
            if (data.length%2==0){
                half1=new int[data.length/2];
                half2=new int[data.length/2];
            } else {
                half1=new int[data.length/2];
                half2=new int[data.length/2+1];
            }
            for (int x=0;x<data.length/2;x++){
                half1[x]=data[x];
            }
            for  (int x=data.length/2,y=0; x<data.length; x++,y++){
                half2[y]=data[x];
            }
            int[] sorted1=mergeSort(half1);
            int[] sorted2=mergeSort(half2);
            int[] out=combine(sorted1,sorted2);
            return out;
        }
    }

    public static void main(String[] args) {
        for (int z=10;z<100000000;z*=2){
            int size=z;
            System.out.println("\n-----------------");
            Random randomGenerator=new Random();

            int[] randData1=new int[size];
            for (int x=0;x<randData1.length; x++){
                randData1[x]=randomGenerator.nextInt();
            }

            TimeMe timer=new TimeMe();
            timer.start();
            int[] sorted1=mergeSort(randData1);
            timer.lap();
            System.out.println("Merge sort arrays size: "+size+" entries");
            timer.printTime();
        }
    }
}
