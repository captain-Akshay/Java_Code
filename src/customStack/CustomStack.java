package customStack;

public class CustomStack {
    private int [] data;
    private int ptr=0;
    private static final int DEFAULT_SIZE=10;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        data=new int[size];
    }
    public void add(int a){
        if(!isFull()){
            data[ptr++]=a;
        }
        else{
            System.out.println("StackFull!!");
        }
    }
    public int pop(){
        return data[ptr--];
    }
    public boolean isFull(){
        return ptr==data.length;
    }

    public void display() {
        for(int i=0;i<ptr;i++){
            System.out.println(data[i]+"->");
        }
    }
}
