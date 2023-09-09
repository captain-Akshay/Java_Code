package javaapplication;
import java.util.ArrayList;
import java.util.Scanner;
public class main {
        static class sbAcc{
            double inRate=0;
            double amount=0;
            Scanner scan=new Scanner(System.in);
            public  double get(){
                System.out.println("Enter the Amount:");
                amount=scan.nextInt();
                System.out.println("Press 1 for NRI");
                System.out.println("Press 2 for General");
                int choice=scan.nextInt();
                if(choice==1)inRate=6;
                else inRate=4;
                System.out.println("Enter the year:");
                int year=scan.nextInt();
                return amount+amount*year*inRate/100;
            }
        }
        static class fdAcc{
            double inRate=0;
            double amount=0;
            Scanner scan=new Scanner(System.in);
            int age=0;
            int days=0;
            public double get(){
                System.out.println("Enter the Amount:");
                amount=scan.nextInt();
                System.out.println("Enter the Age:");
                age=scan.nextInt();
                System.out.println("Enter the days:");
                days=scan.nextInt();
                if(amount<10000000){
                    if(days>=7&&days<=14){
                        inRate=4.50;
                    }
                    else if(days>=15&&days<=29){
                        inRate=4.75;
                    }
                    else if(days>=30&&days<=45){
                        inRate=5.0;
                    }
                    else if(days>=45&&days<=60){
                        inRate=7;
                    }
                    else if(days>=61&&days<=184){
                        inRate=7.50;
                    }
                    else if(days>=184&&days<=365){
                        inRate=8.0;
                    }
                    if(age>50)inRate+=0.5;
                }
                else{
                    if(days>=7&&days<=14){
                        inRate=6.50;
                    }
                    else if(days>=15&&days<=29){
                        inRate=6.75;
                    }
                    else if(days>=30&&days<=45){
                        inRate=6.75;
                    }
                    else if(days>=45&&days<=60)inRate=8;
                    else if(days>=61&&days<=184)inRate=8.5;
                    else if(days>=184&&days<=365)inRate=10.0;
                }
                return amount+(amount*inRate/100);
            }}
        static class rdAcc{
            double inRate=0;
            double amount=0;
            Scanner scan=new Scanner(System.in);
            int age=0;
            int mon=0;
            public double get(){
                System.out.println("Enter the Amount:");
                amount=scan.nextInt();
                System.out.println("Enter the Age:");
                age=scan.nextInt();
                System.out.println("Enter the Months:");
                mon=scan.nextInt();
                if(mon==6)inRate=7.50;
                else if(mon==9) inRate=7.75;
                else if(mon==12) inRate=8.0;
                else if(mon==15) inRate=8.25;
                else if(mon==18) inRate=8.50;
                else if(mon==21) inRate=8.75;
                if(age>50)inRate+=0.5;
                return amount+amount*inRate*mon/100;
            }
        }
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            while(true){
                System.out.println("Enter The choice:");
                System.out.println("1. for FD");
                System.out.println("2. for SB");
                System.out.println("3. for RD");
                System.out.println("4. for Exit");
                int ch=scan.nextInt();
                switch(ch){
                    case 1:
                        fdAcc temp=new fdAcc();
                        double fin=temp.get();
                        System.out.println("The Total Amount is :"+fin);
                        break;
                    case 2:
                        rdAcc t2=new rdAcc();
                        double f2=t2.get();
                        System.out.println("The Total Amount is :"+f2);
                    case 3:
                        sbAcc t3=new sbAcc();
                        double f3=t3.get();
                        System.out.println("The Total Amount is :"+f3);
                    case 4:
                        break;
                }
            }
        }
}
