package akshay;
import java.util.*;
import java.lang.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan= new Scanner(System.in);
        int time=scan.nextInt();
        for(int i=0;i<time;i++){
            long n,m;
            n=scan.nextLong();
            m=scan.nextLong();
            if(m==0){
                System.out.println("No 1");
            }
            else if(n%2!=0){
                System.out.println("Yes");
            }
            else if(n%2==0) {
                if (m == 1 || m == n - 1) {
                    System.out.println("Yes");
                } else if (m % 2 == 0) {
                    if (n % m == 0) {
                        System.out.println("No " + n / m);
                    } else {
                        System.out.println("No " + n / 2);
                    }
                }
                else{
                        if (n % m == 0) {
                            System.out.println("No 2");
                        } else {
                            System.out.println("Yes");
                        }
                    }
                }
            }
        }
	}