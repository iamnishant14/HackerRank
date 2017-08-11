import java.io.*;
import java.util.*;
import java.lang.*;

class DoubleLL{
    static class Node{
        int data;
        Node next,prev;

        Node(int item){
            data=item;
            next=prev=null;
        }
    }
    static Node head, temp;
    DoubleLL(){
        head=temp=null;
        temp=head;
    }
    public static void push(int item){
        if(head==null){
            head= new Node(item);
            temp=head;
        }
        else{
            temp.next=new Node(item);
            temp.next.prev= temp;
            temp=temp.next;
        }
    }
    public static void pushAtSpecific(int item,int pos){
        Node trav=new Node(item);
        Node temp=head;
        if(pos==1){
            trav.next=head;
            head=trav;
        }
        else{
            int count=1;
            while(count!=pos-1){
                temp=temp.next;
                count++;
            }
            trav.next=temp.next;
            temp.next.prev=trav;
            temp.next=trav;
            trav.prev=temp;
        }
        System.gc();
    }

    public static void delete(int item){
        Node temp=head;
        while(temp.data!=item){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Not Found");
            return;
        }
        else{
        Node temp1=temp;
        temp=temp.prev;
        temp.next=temp.next.next;
        temp.next.prev=temp;
        System.gc();
        }
    }

    public static void display(){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print(temp.data);
        System.out.println();
        System.gc();
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        DoubleLL list= new DoubleLL();
        int n= sc.nextInt();
        while(n>0){
            list.push(sc.nextInt());
            n--;
        }
        list.display();
        list.delete(sc.nextInt());
        list.display();
        list.pushAtSpecific(sc.nextInt(),sc.nextInt());
        list.display();
    }
}