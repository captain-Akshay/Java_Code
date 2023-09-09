package hashSet;
public class CustomHashSet {
    public static void main(String[] args) {
        CustomHashSet a=new CustomHashSet();
        a.add(5);
        a.add(7);
        a.add(6);
        a.add(5);
        a.add(7);
        System.out.println(a.contains(5));
        System.out.println(a.contains(3));
        a.remove(5);
        a.remove(7);
        a.remove(9);
        System.out.print(a.contains(5));
        System.out.println(a.contains(8));
        System.out.println(a.contains(6));
    }
    public static class DoubleLinkedList {
        int data;
        DoubleLinkedList prev;
        DoubleLinkedList next;
        public DoubleLinkedList(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
        public DoubleLinkedList(int data,DoubleLinkedList prev){
            this.data=data;
            this.prev=prev;
            this.next=null;
        }
    }
    DoubleLinkedList[] data;
    public CustomHashSet() {
           this.data=new DoubleLinkedList[13457];
    }
    public int hashFunc(int key){
        return key%13457;
    }
    public void add(int key) {
            int i=hashFunc(key);
            if(search(i,key)!=-1){
                return;
            }else{
                if(data[i]==null){
                    data[i]= new DoubleLinkedList(key);
                }else{
                    addIn(data[i],key);
                }
            }

    }

    private void addIn(DoubleLinkedList a,int key) {
        DoubleLinkedList temp=a;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next= new DoubleLinkedList(key, temp);
    }

    private int search(int i,int key) {
        DoubleLinkedList j=data[i];
        int count=1;
            while(j!=null){
                if(j.data==key){
                    return count;
                }
                count++;
                j=j.next;
            }
            return -1;
    }

    public void remove(int key) {
        int i=hashFunc(key);
        if(search(i,key)!=-1){
            removeIn(data[i],key,i);
        }else{
            return;
        }
    }

    private void removeIn(DoubleLinkedList datum, int key,int i) {
        DoubleLinkedList temp=datum;
        while(temp.data!=key){
            temp=temp.next;
        }
        if(temp.next!=null&&temp.prev!=null){
        temp.next.prev=temp.prev;
        temp.prev.next=temp.next;}
        else if(temp.prev==null&&temp.next==null){
        data[i]=null;
        }
        else{
        temp.prev.next=null;
        }
    }

    public boolean contains(int key) {
        int i=hashFunc(key);
        return search(i, key) != -1;
    }
}