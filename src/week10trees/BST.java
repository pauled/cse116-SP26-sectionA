package week10trees;

import week7polymorphism.Comparator;
import week7polymorphism.IntIncreasing;

public class BST<A> {
    private BTN<A> root;
    private Comparator<A> comparator;

    public BST(Comparator<A> comparator){
        this.root=null;
        this.comparator=comparator;
    }
    public void insert(A value){
        if (this.root==null){
            this.root=new BTN<>(value,null,null);
        } else {
            this.insertHelper(this.root,value);
        }
    }
    public void insertHelper(BTN<A> node,A value){
        if (this.comparator.compare(value,node.value)){
            if (node.left==null){
                node.left=new BTN<>(value,null,null);
            } else {
                this.insertHelper(node.left,value);
            }
        } else {
            if (node.right==null){
                node.right=new BTN<>(value,null,null);
            } else {
                this.insertHelper(node.right,value);
            }
        }
    }

    public static void main(String[] args) {
        BST<Integer> bst=new BST<>(new IntIncreasing());
        bst.insert(5);
        bst.insert(2);
        bst.insert(3);
    }
}
