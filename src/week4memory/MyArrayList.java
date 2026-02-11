package week4memory;

public class MyArrayList {
    int[] vals;
    int size;

    public MyArrayList(){
        this.vals=new int[3];
        this.size=0;
    }
    public void append(int val){
        if (this.size>=this.vals.length){
            int[] temp=new int[this.vals.length*2];
            for (int x=0;x<this.vals.length;x++){
                temp[x]=this.vals[x];
            }
            this.vals=temp;
        }
        this.vals[this.size]=val;
        this.size++;
    }
    public int getVal(int loc){
        return this.vals[loc];
    }
    public void setVal(int loc,int val){
        if (loc<this.size){
            this.vals[loc]=val;
        }
    }

    public static void main(String[] args) {
        int[] nums=new int[3];

        //each operations takes O(1)
        nums[0]=2;
        nums[1]=4;
        nums[2]=8;

        MyArrayList m=new MyArrayList();
        m.append(1);

        //O(n)
        for (int x=0; x<nums.length;x++){
            nums[x]*=2;
        }

        //O(n^2)
        for (int x=0; x<nums.length; x++){
            for (int y=0;y<nums.length-2; y++) {
                nums[x] *= 2*y;
            }
        }
    }
}
