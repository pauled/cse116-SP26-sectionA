package week5;

public class Stack <G>{
    private LLN<G> head;

    public Stack(){
        this.head=null;
    }

    public void push(G value){
        this.head=new LLN<>(value,this.head);
    }
    public G pop(){
        if (this.head==null){
            return null;
        } else {
            G temp=this.head.getData();
            this.head=this.head.getNext();
            return temp;
        }
    }
    public String toString(){
        return this.head.toString();
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Integer temp=stack.pop();
        System.out.println(stack);
    }
}
