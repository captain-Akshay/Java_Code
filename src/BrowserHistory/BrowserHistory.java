package BrowserHistory;
class Node{
    String val;
    Node prev;
    Node next;
    Node(String val){
        this.val=val;
        this.prev=null;
        this.next=null;
    }
    Node(String val, Node next, Node prev){
        this.val=val;
        this.prev=prev;
        this.next=next;
    }
    Node(String val,Node next){
        this.val = val;
        this.next = next;
        this.prev = null;
    }
}
class BrowserHistory {
    Node current;

    public BrowserHistory(String homepage) {
        current=new Node(homepage);

    }
    private void addGo(String s){
        Node newNode= new Node(s);
        current.next=newNode;
        newNode.prev=current;
        this.current=newNode;
    }
    public void visit(String url) {
        addGo(url);
    }
    private String backGo(int step){
        Node temp=current;
        if(temp.prev==null) return null;
        while(temp.prev!=null&&step>0){
         temp=temp.prev;
         step--;
        }
        String ans=temp.val;
        this.current=temp;
        return ans;
    }
    public String back(int steps) {
        return backGo(steps);
    }
    private String forwardGo(int step){
        Node temp=current;
        if(temp.next==null) return temp.val;
        while(temp.next!=null&&step>0){
            temp=temp.next;
            step--;
        }
        String ans= temp.val;
        this.current=temp;
        return ans;
    }
    public String forward(int steps) {
        return forwardGo(steps);
    }
}