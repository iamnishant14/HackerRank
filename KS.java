import java.io.*;
import java.util.*;
import java.lang.*;

class KS{
	class Node{
		int key;
		Node left,right;
		Node(int item){
			key=item;
			left=right=null;
		}
	}

	Node root;

	KS(){
		root=null;
	}

	void addEdge(int key){
		root=addEdgeRec(root,key);
	}

	Node addEdgeRec(Node root,int key){
		if(root==null){
			return new Node(key);
		}

		if(root.key>key){
			root.left=addEdgeRec(root.left,key);
		}
		else if(root.key<key){
			root.right=addEdgeRec(root.right,key);
		}
		return root;
	}

	void traverse(){
		inorder(root);
		System.out.println();
	}

	void inorder(Node root){
		if(root!=null){
			inorder(root.left);
			System.out.print(root.key+" ");
			inorder(root.right);
		}
	}

	void Print(Node root,int k1,int k2){
		if(root==null){
			return;
		}
		if(root.key>k1){
			Print(root.left,k1,k2);
		}
		if(k1<=root.key&&root.key<=k2){
			System.out.print(root.key+" ");
		}
		if(k2>root.key){
			Print(root.right,k1,k2);
		}
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		KS tree= new KS();
		while(t-->0){
			tree.addEdge(sc.nextInt());
		}
		System.out.println();
		tree.traverse();
		tree.Print(tree.root, sc.nextInt(),sc.nextInt());

	}
}