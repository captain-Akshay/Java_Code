package akshay;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
        Scanner scan= new Scanner(System.in);
        int num1=scan.nextInt();
        int sum=0,a=0,b=1;
        if(num1>2){
            while(num1!=0) {
                sum = a + b;
                a = b;
                b = sum;
                num1--;
            }
            System.out.println(sum);
        }
        else{
            System.out.println(num1);
        }

        }
    }
}
