package week4memory;

public class Recursion {

    public static int add(int[] vals){
        int out=0;
        for (int x=0;x<vals.length;x++){
            out+=vals[x];
        }
        return out;
    }
    public static int addRecurse(int[] vals,int loc){
        if (loc>=vals.length){
            return 0;
        } else {
            int temp=vals[loc];
            temp+=addRecurse(vals,loc+1);
            return temp;
        }
    }
    public static int addRe(int[] vals){
        return addRecurse2(vals,0,0);
    }
    public static int addRecurse2(int[] vals,int loc,int total){
        if (loc>=vals.length){
            return total;
        } else {
            return addRecurse2(vals,loc+1,total+vals[loc]);
        }
    }
    public static int addTwo(int a,int b){
        if (b==0){
            return a;
        } else if(b>0){
            return addTwo(a+1,b-1);
        } else {
            return addTwo(a-1,b+1);
        }
    }

    public static void main(String[] args) {
        int[] nums=new int[3];
        for (int x=0;x<nums.length;x++){
            nums[x]=x*2;
        }
        int temp=add(nums);
        System.out.println(temp);
        temp=addRecurse(nums,0);
        System.out.println(temp);
        temp=addTwo(6,3);
        System.out.println(temp);

        int out=0;
        for (int x=0;x<nums.length;x++){
            for (int y=0;y<10000;y++){
                out+=nums[x];
            }
        }
    }
}
