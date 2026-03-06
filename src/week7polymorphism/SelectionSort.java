package week7polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort <T>{
    private Comparator<T> comparator;

    public SelectionSort(Comparator<T> comparator){
        this.comparator=comparator;
    }

    public ArrayList<T> sort(ArrayList<T> input){
        ArrayList<T> output=new ArrayList<>();
        while (input.size()>0){
            int locFirst=0;
            for (int x=0;x<input.size();x++){
                T currentFirst=input.get(locFirst);
                T toCompare=input.get(x);
                if (this.comparator.compare(currentFirst,toCompare)){
                    locFirst=x;
                }
            }
            output.add(input.remove(locFirst));
        }
        return output;
    }

    public static void main(String[] args) {
        SelectionSort<Integer> sorter=new SelectionSort<>(
                new IntDecreasing()
        );
        ArrayList<Integer> list=new ArrayList<>(
                Arrays.asList(1,6,5));
        ArrayList<Integer> output=sorter.sort(list);
        System.out.println(output);
        SelectionSort<Integer> sorter2=new SelectionSort<>(
                new IntIncreasing()
        );
        list=sorter2.sort(output);
        System.out.println(list);
    }
}
