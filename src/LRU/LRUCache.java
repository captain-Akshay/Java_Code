package LRU;

import java.util.HashMap;

class DoubleLinked{
    Node head;
    Node tail;
    DoubleLinked(){
        this.head=null;
        this.tail=null;
    }
    public Node insertFirst(int key,int val){
        if(head==null) {
            this.head = new Node(val,key);
            this.tail=head;
        }else{
            Node newNode=new Node(val,key,head);
            head.prev=newNode;
            head=newNode;
        }
        return head;

    }
    public void deleteKey(int key) {
        Node temp=head;
        while(temp.key!=key){
            temp=temp.next;
        }
        if(temp==head){
            head=head.next;
            if(head!=null) head.prev=null;
        }else if(tail==temp){
            tail=tail.prev;
            if(tail!=null) tail.next=null;
        }
        else{
            Node previ=temp.prev;
            previ.next=temp.next;
            temp.next.prev=previ;
            temp.prev=null;
            temp.next=null;
        }
    }
    public int deleteLast() {
        if(tail==null) return -1;
        int re=tail.key;
        tail=tail.prev;
        if(tail!=null) tail.next=null;
        return re;
    }
}
class Node{
    int key;
    int val;
    Node prev;
    Node next;
    Node(int val,int key){
        this.key=key;
        this.val=val;
        this.prev=null;
        this.next=null;
    }
    Node(int val,int key,Node next,Node prev){
        this.key=key;
        this.val=val;
        this.prev=prev;
        this.next=next;
    }
    Node(int val,int key,Node next){
        this.key=key;
        this.val = val;
        this.next = next;
        this.prev = null;
    }
}
class LRUCache {
    DoubleLinked dl=new DoubleLinked();
    int capacity;
    int size;
    HashMap<Integer,Node> hs=new HashMap<>();
    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.size=0;
    }
    public int get(int key) {
        if(hs.containsKey(key)){
            int value=hs.get(key).val;
            dl.deleteKey(key);
            hs.put(key,dl.insertFirst(key,value));
            return value;
        }
        return -1;
    }
    public void put(int key, int value) {
        if(hs.containsKey(key)){
            dl.deleteKey(key);
            hs.put(key,dl.insertFirst(key,value));
        }else{
            if(size<capacity){
                hs.put(key,dl.insertFirst(key,value));
                size++;
            }else{
                int keydelete=dl.deleteLast();
                if(keydelete!=-1){
                    hs.remove(keydelete);
                    hs.put(key,dl.insertFirst(key,value));
                }
            }
        }
    }
}