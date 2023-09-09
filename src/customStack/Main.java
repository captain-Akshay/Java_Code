package customStack;

public class Main {
    public static void main(String[] args) {
        CustomStack s=new CustomStack(5);
        s.add(5);
        s.add(2);
        s.add(3);
        s.add(1);
        s.add(7);
        s.add(0);
        s.display();
        s.pop();
        s.pop();
        s.display();
    }
    }
