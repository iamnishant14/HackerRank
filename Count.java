import java.io.*;
import java.lang.*;
import java.util.*;

class Count{
	static class Node{
		int data;
		Node next,prev;

		Node(int item){
			data=item;
			next=prev=null;
		}
	}
	static Node head,temp;
	Count(){
		head=temp=null;
		temp=head;
	}

	public static void push(int item){
		if(temp==null){
			head=new Node(item);
			temp=head;
		}
		else{
			Node x= new Node(item);
			temp.next=x;
			x.prev=temp;
			temp=x;
		}
	}
	public static void pushAtSpecific(int item,int pos){
		if(pos==1){
			Node trav=new Node(item);
			trav.next=head;
			head.prev=trav;
			head=trav;
		}
		else{
			Node trav= new Node(item);
			Node temp=head;
			int count=1;
			while(count<pos-1){
				temp=temp.next;
			}
			trav.next=temp.next;
			temp.next.prev=trav;
			temp.next=trav;
			trav.prev=temp;
		}
	}

	public static void delete(int item){
		Node temp=head;
		while(temp.data!=item){
			temp=temp.next;
		}
		if(temp==null){
			System.out.println("Not Found");
		}
		else if(temp.data==head.data){
			temp=head;
			head=head.next;
			head.prev=null;
			temp.next=null;
			System.gc();
		}
		else if(temp.next==null){
			Node x=temp;
			temp=temp.prev;
			temp.next=null;
			x.prev=null;
			System.gc();
		}
		else{
			Node x=temp;
			temp=temp.prev;
			temp.next=temp.next.next;
			temp.next.prev=temp;
			x.prev=x.next=null;
			System.gc();
		}
	}

	public static void display(){
		Node temp=head;
		if(head==null){
			System.out.println("No list to display");
		}
		else{
			while(temp.next!=null){
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.print(temp.data);
			System.out.println();
		}
	}
	public static int countApp(int item){
		Node temp=head;
		int count=0;
		while(temp!=null){
			if(temp.data==item){
				count++;
			}
			temp=temp.next;
		}
		return count;
	}

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		Count list=new Count();
		while(n>0){
			list.push(sc.nextInt());
			n--;
		}
		list.display();
		list.pushAtSpecific(sc.nextInt(),sc.nextInt());
		list.display();
		list.delete(sc.nextInt());
		list.display();
		int number=sc.nextInt();
		System.out.println("Count of "+number+"is : "+list.countApp());
	}
}