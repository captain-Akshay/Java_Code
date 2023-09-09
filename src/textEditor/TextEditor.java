package textEditor;
class Node{
    char val;
    Node prev;
    Node next;
    Node(char val){
        this.val=val;
        this.prev=null;
        this.next=null;
    }
    Node(char val,Node next,Node prev){
        this.val=val;
        this.prev=prev;
        this.next=next;
    }
    Node(char val,Node next){
        this.val = val;
        this.next = next;
        this.prev = null;
    }
}
class TextEditor {
    Node first;
    Node cursor;
    int size;
    int locsize=0;
    public TextEditor() {
        cursor =new Node('|');
        first=cursor;
        size=0;
    }
    private void add(String text){
        Node temp=cursor;
        for(int i=text.length()-1;i>=0;i--){
            Node node= new Node(text.charAt(i));
            temp.prev=node;
            node.next=temp;
            temp=node;
        }
        size+=text.length();
        locsize=size;
        first=temp;
    }
    public void display(){
        Node temp= first;
        while(temp!=null&&temp.val!='|') {
            System.out.print(temp.val);
            temp = temp.next;
        }
    }
    public String display(int x){
        Node temp=first;
        String ans="";
        while(x!=0 && temp.next!=null){
            ans+=temp.val;
            temp=temp.next;
        }
        return ans;
    }
    public void addText(String text) {
        add(text);
    }
    public int deleteText(int k) {
        if(k>=size){
            cursor.prev=null;
            first=cursor;
            return size;
        }
        int index=k+1;
        Node temp=cursor;
        while(index!=0&& temp.prev!=null) {
            temp = temp.prev;
            index--;
        }
        temp.next=cursor;
        cursor.prev=temp;
        size-=k;
        locsize=size;
        return k;
    }
//
    public String cursorLeft(int k) {
        if(k>=locsize){
            locsize=0;
            if(cursor.prev!=null){
            cursor.prev.next=null;
            cursor.next=first;
            first.prev=cursor;
            return "";
            }
        }
        Node temp=cursor;
        int index=k;
        while(index!=0){
            temp=temp.prev;
            index--;
        }
        cursor.prev.next=null;
        cursor.prev=temp.prev;
        cursor.next=temp;
        temp.prev=cursor;
        locsize-=k;
        return display(Math.min(locsize,10));
    }
//
//    public String cursorRight(int k) {
//
//    }
}