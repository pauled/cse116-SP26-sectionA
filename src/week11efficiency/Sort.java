package week11efficiency;

import java.util.ArrayList;
import java.util.Random;

public class Sort {
    public static int[] bubbleSortDumb(int[] out){
        for (int x=0;x<out.length-1;x++){
            for (int y=0;y<x;y++){
                if(out[y]>out[y+1]){
                    int temp=out[y];
                    out[y]=out[y+1];
                    out[y+1]=temp;
                }
            }
        }
        return out;
    }
    public static int[] bubbleSort(int[] out){
        boolean swap=true;
        while (swap){
            swap=false;
            for (int y=0;y<out.length-1;y++){
                if(out[y]>out[y+1]){
                    int temp=out[y];
                    out[y]=out[y+1];
                    out[y+1]=temp;
                    swap=true;
                }
            }
        }
        return out;
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
    public static ArrayList<Integer> combineAL(ArrayList<Integer> half1,ArrayList<Integer> half2){
        ArrayList<Integer> out=new ArrayList<>();
        int loc1=0;
        int loc2=0;
        int locOut=0;
        while (loc1<half1.size() && loc2<half2.size()){
            if (half1.get(loc1)<half2.get(loc2)){
                out.add(half1.get(loc1));
                loc1++;
            } else {
                out.add(half2.get(loc2));
                loc2++;
            }
        }
        while (loc1<half1.size()){
            out.add(half1.get(loc1));
            loc1++;
        }
        while (loc2<half2.size()){
            out.add(half2.get(loc2));
            loc2++;
        }
        return out;
    }
    public static ArrayList<Integer> mergeSortAL(ArrayList<Integer> data){
        if (data.size()==1){
            return data;
        } else {
            ArrayList<Integer> half1=new ArrayList<>();
            ArrayList<Integer> half2=new ArrayList<>();
            for (int x=0;x<data.size()/2;x++){
                half1.add(data.get(x));
            }
            for  (int x=data.size()/2; x<data.size(); x++){
                half2.add(data.get(x));
            }
            ArrayList<Integer> sorted1=mergeSortAL(half1);
            ArrayList<Integer> sorted2=mergeSortAL(half2);
            ArrayList<Integer> out=combineAL(sorted1,sorted2);
            return out;
        }
    }
    public static int[] addLists(int[] list1,int[] list2){
        int[] out=new int[list1.length+list2.length];
        for (int x=0;x<list1.length;x++){
            out[x]=list1[x];
        }
        for (int x=0;x<list2.length;x++){
            out[x+list1.length]=list2[x];
        }
        return out;
    }

    public static void main(String[] args) {
        for (int z=10;z<100000000;z*=2){
            int size=z;
            System.out.println("\n-----------------");
            Random randomGenerator=new Random();

            int[] randData1=new int[size];
            int[] randData2=new int[size];
            int[] randData3=new int[size];
            int[] tenEntries=new int[10];
            ArrayList<Integer> randData0=new ArrayList<>();
            ArrayList<Integer> tenEntries0=new ArrayList<>();
            for (int x=0;x<randData1.length; x++){
                randData1[x]=randomGenerator.nextInt();
                randData2[x]=randomGenerator.nextInt();
                randData3[x]=randomGenerator.nextInt();
                randData0.add(randomGenerator.nextInt());
            }
            for (int x=0;x<tenEntries.length; x++){
                tenEntries[x]=randomGenerator.nextInt();
                tenEntries0.add(randomGenerator.nextInt());
            }

            TimeMe timer=new TimeMe();
            timer.start();
            ArrayList<Integer> sorted0=mergeSortAL(randData0);
            timer.lap();
            System.out.println("Merge sort AL arrays size: "+size+" entries");
            timer.printTime();

            timer=new TimeMe();
            timer.start();
            int[] sorted1=mergeSort(randData1);
            timer.lap();
            System.out.println("Merge sort arrays size: "+size+" entries");
            timer.printTime();
/*
            timer=new TimeMe();
            timer.start();
            int[] sorted2=bubbleSortDumb(randData2);
            timer.lap();
            System.out.println("Bubble sort dumb arrays size: "+size+" entries");
            timer.printTime();

            timer=new TimeMe();
            timer.start();
            int[] sorted3=bubbleSort(randData3);
            timer.lap();
            System.out.println("Bubble sort arrays size: "+size+" entries");
            timer.printTime();
*/
            timer=new TimeMe();
            randData1=addLists(sorted1,tenEntries);
            timer.start();
            int[] sorted4=mergeSort(randData1);
            timer.lap();
            System.out.println("Merge sort arrays 10 new size: "+size+" entries");
            timer.printTime();

            timer=new TimeMe();
            randData2=addLists(sorted1,tenEntries);
            timer.start();
            int[] sorted5=bubbleSortDumb(randData2);
            timer.lap();
            System.out.println("Bubble sort dumb arrays 10 new size: "+size+" entries");
            timer.printTime();

            timer=new TimeMe();
            randData3=addLists(sorted1,tenEntries);
            timer.start();
            int[] sorted6=bubbleSort(randData3);
            timer.lap();
            System.out.println("Bubble sort arrays 10 new size: "+size+" entries");
            timer.printTime();

            timer=new TimeMe();
            randData3=addLists(tenEntries,sorted1);
            timer.start();
            int[] sorted7=bubbleSort(randData3);
            timer.lap();
            System.out.println("Bubble sort arrays 10 new size front: "+size+" entries");
            timer.printTime();
        }
    }
}
