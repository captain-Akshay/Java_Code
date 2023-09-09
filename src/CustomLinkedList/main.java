package CustomLinkedList;

public class main {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertLast(5);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(7);
        list.deleteDuplicates();
        list.display();
    }
}
