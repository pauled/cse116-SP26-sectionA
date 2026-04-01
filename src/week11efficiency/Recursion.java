package week11efficiency;

public class Recursion {
    public static int addToSpotRegRec(int[] vals,int loc){
        if (loc<=0){
            return vals[0];
        } else if (loc>=vals.length){
            return addToSpotRegRec(vals,loc-1);
        } else {
            int temp=addToSpotRegRec(vals,loc-1);
            return vals[loc]+temp;
        }
    }
    public static int addToSpotTailec(int[] vals,int loc){
        return addToSpotTailRecHelper(vals,loc,0);
    }
    public static int addToSpotTailRecHelper(int[] vals,int loc, int total){
        if (loc<=0){
            return vals[0]+total;
        } else if (loc>=vals.length){
            return addToSpotTailRecHelper(vals,loc-1,total);
        } else {
            return addToSpotTailRecHelper(vals,loc-1,total+vals[loc]);
        }
    }
    public static void main(String[] args) {
        int [] nums=new int [3];
        nums[0]=3;
        nums[1]=6;
        nums[2]=9;
        int total1=addToSpotRegRec(nums,3);
        int total2=addToSpotTailec(nums,2);
        System.out.println(total1);
        System.out.println(total2);
    }
}









