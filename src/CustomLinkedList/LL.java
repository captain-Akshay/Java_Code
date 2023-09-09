package CustomLinkedList;

import java.util.LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    LL(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int val){
        Node node =new Node(val);
        if(head==null&&tail==null){
            head=node;
        }else{
            tail.next=node;
        }
        tail=node;
        size++;
    }
    public void deleteDuplicates() {
        Node temp=head;
        while(temp!=null){
            if(temp.next!=null && temp.val==temp.next.val){
                Node check=temp.next;
                while(check!=null){
                    if(check.val==temp.val){
                        check=check.next;
                    }
                    else{break;}
                }
                temp.next=check;
                temp=temp.next;
            }
        }

    }
    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next= curr.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null){
                next=next.next;}
        }
        tail=head;
        head=prev;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
        Node(int val,Node next){
            this.val=val;
            this.next=next;
        }

    }
}
