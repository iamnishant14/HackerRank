import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.Scanner;

class Node{
    int key;
    Node left,right;

    public Node(int item){
        key=item;
        left=right=null;
    }
}

class Btree{
    Node root;

    public Btree(){
        root=null;
    }

    Node addEdgeRec(Node root,int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key<root.key){
            root.left=addEdgeRec(root.left,key);
        }
        else if(key>root.key){
            root.right=addEdgeRec(root.right, key);
        }
        return root;
    }
    void addEdge(int key){
        root=addEdgeRec(root,key);
    }

    void rectrav(Node root){
        if(root!=null){
            rectrav(root.left);
            System.out.println(root.key+" ");
            rectrav(root.right);
        }
    }
    void traverse(){
        rectrav(root);
    }

    void delete(int key){
        root=deleteRec(root,key);
    }
    Node deleteRec(Node root,int key){
        if(root==null){
            return root;
        }
        if(key<root.key){
            root.left=deleteRec(root.left, key);
        }
        else if(key>root.key){
            root.right=deleteRec(root.right, key);
        }
        else{
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            
            root.key=minval(root.right);
            root.right=deleteRec(root.right,root.key);
        }
        return root;
    }
    int minval(Node root){
        int min=root.key;
        while(root.left!=null){
            min=root.left.key;
            root=root.left;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Btree b= new Btree();
        int t= sc.nextInt();
        while(t-->0){
            b.addEdge(sc.nextInt());
        }
        System.out.println();
        b.traverse();
        int q=sc.nextInt();
        while(q-->0){
            b.delete(sc.nextInt());
        }
        System.out.println();
        b.traverse();
    }
}