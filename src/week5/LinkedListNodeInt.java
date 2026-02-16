package week5;

public class LinkedListNodeInt {
    private int data;
    private LinkedListNodeInt next;

    public LinkedListNodeInt(int val,LinkedListNodeInt next){
        this.data=val;
        this.next=next;
    }
    public String toString2(){
        LinkedListNodeInt current=this;
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

    public static void main(String[] args) {
        LinkedListNodeInt head=new LinkedListNodeInt(1,null);
        LinkedListNodeInt tail=head;
        head=new LinkedListNodeInt(2,head);
        head=new LinkedListNodeInt(3,head);
        String out=head.toString();
        System.out.println(out);
    }
}
