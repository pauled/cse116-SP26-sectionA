package week10trees;

import week7polymorphism.Comparator;

public class BST<A> {
    private BTN<A> root;
    private Comparator<A> comparator;

    public BST(BTN<A> root,Comparator<A> comparator){
        this.root=root;
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
}
