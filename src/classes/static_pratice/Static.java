package classes.static_pratice;

public class Static {
    static int a=4;
    static int b;
    static{
        System.out.println("I m in Static block");
        b=a*5;
    }

    public static void main(String[] args) {
        Static a=new Static();
        System.out.println(Static.a +" "+Static.b );

    }
}
