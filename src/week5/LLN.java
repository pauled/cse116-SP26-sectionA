package week5;

public class LLN<T> {
    private T data;
    private LLN next;

    public LLN(T val,LLN next){
        this.data=val;
        this.next=next;
    }
    public String toString2(){
        LLN current=this;
        String out="";
        while (current!=null){
            out+=current.data+" ";
            current=current.next;
        }
        return out;
    }
    public String toString(){
        String out="";
        out+=this.data+" ";
        if (this.next!=null){
            out+=this.next.toString();
        }
        return out;/*
        if (this.next!=null){
            return this.data+" "+this.next.toString();
        }
        return this.data+" ";*/
    }
    public int size(){
        //return size of linked list
        if (this.next==null){
            return 1;
        }
        return 1+this.next.size();
    }
    public void append(T value){
        //append an item to the end of the list
        if (this.next==null){
            this.next=new LLN(value,null);
        } else {
            this.next.append(value);
        }
    }
    public int find(T value){
        //returns the location of the item in the list or -1
        return -1;
    }
    public void insert(T value, int loc){
        if (loc==0) {
            return;
        } else if (loc==1){
            LLN<T> temp=new LLN<>(value,this.next);
            this.next=temp;
        } else if(this.next==null){
            return;
        }else if (loc>1){
            this.next.insert(value,loc-1);
        }

    }


    public static void main(String[] args) {
        LLN<Integer> head=new LLN(1,null);
        LLN<Integer> tail=head;
        head=new LLN(2,head);
        head=new LLN(3,head);
        String out=head.toString();
        System.out.println(out);
    }
}
