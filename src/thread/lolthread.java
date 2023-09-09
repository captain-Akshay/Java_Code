package thread;
import java.util.ArrayList;
import java.util.HashSet;

class common{
    public synchronized void print(int i){
        while(i--!=0)
            System.out.println("Exteded Thread->"+i);
    }
}

class Mythread extends Thread{
    common c;
    Mythread(common c){
        this.c=c;
    }
    public void run(){
        c.print(5);

    }
}
class Mythread2 extends Thread{
    common c;
    Mythread2(common c) {
        this.c=c;
    }
    public void run(){
        c.print(10);
    }
}
public class lolthread {
    public static void main(String[] args) {
        common c=new common();
        Mythread t1=new Mythread(c);
        Mythread2 t2=new Mythread2(c);
        t1.start();
        t2.start();
    }
}