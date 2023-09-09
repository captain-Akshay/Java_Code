package classes;


public  class Student extends Parent{
    String name;
    int marks;
    int roll;
    Student(int roll,String name,int marks){
        super("father","mothe");
        System.out.println("Student parameterised Constructor is called!");
        this.name=name;
        this.roll=roll;
        this.marks=marks;
    }
    Student(){
        System.out.println("Student Constructor is called!");
    }
}
