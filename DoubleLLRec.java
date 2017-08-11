import java.io.*;
import java.util.*;
import java.lang.*;

class DoubleLLRec{
    static class Node{
        int data;
        Node next;

        Node(int item){ data=item;next=null;}
    }
    private static Node head,temp;

    DoubleLLRec(){
        head=temp=null;
    }
    public static void push(int item){
        if(temp==null){
            head= new Node(item);
            temp=head;
        }
        else{
            temp.next=new Node(item);
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
            temp.next=trav;
        }
    }

    public static void delete(int item){
        Node trav=head;
        while(trav.next!=null){
            if(trav.data==item)
                break;
            else
                trav=trav.next;
        }
        if(trav.next==null){
            System.out.println("Not found");
            return;
        }
        else{
            while(trav.next!=null){
                if(trav.next.next==null){
                    trav.data=trav.next.data;
                    trav.next=null;
                    break;
                }
                trav.data=trav.next.data;
                trav=trav.next;
            }
             System.gc();
        }
    }

    public static void display(){
        Node trav=head;
        while(trav.next!=null){
            System.out.print(trav.data +"->");
            trav=trav.next;
        }
        System.out.print(trav.data);
        System.out.println();
    }

    public static int countList(Node head,int count){
        if(head==null)
            return count;
        else
            return countList(head.next,count+1);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        DoubleLLRec list= new DoubleLLRec();
        int count=sc.nextInt();
        while(count>0){
            list.push(sc.nextInt());
            count--;
        }
        list.display();
        list.pushAtSpecific(sc.nextInt(),sc.nextInt());
        list.display();
        int x=sc.nextInt();
        list.delete(x);
        list.display();
        System.out.println("Length of List: "+list.countList(list.head,0));
    }
}