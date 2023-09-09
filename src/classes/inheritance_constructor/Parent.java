package classes;

public class Parent {
    String father_name;
    String mother_name;
    Parent(){
        System.out.println("Parent Constructor is called!");
    }
    Parent(String A,String B){
        System.out.println("Parent parameterised constructor ");
        this.father_name=A;
        this.mother_name=B;

    }
}
