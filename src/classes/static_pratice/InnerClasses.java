package classes.static_pratice;

public class InnerClasses { //outside classes cannot be static
    static class test{
        int a;
        test(){
            a=5;
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        test abc=new test();
    }
}

