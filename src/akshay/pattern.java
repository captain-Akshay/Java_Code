package akshay;

public class pattern {
    public static void main(String []args){
        pattern15(5);
    }
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row=0;row<n;row++){
            for(int col=n;col>row;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int row=1;row<2*n;row++){
            int newRow=row;
            if(row>n){
                newRow=n-(row-n);
            }
            for(int col=1;col<=newRow;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int row=0;row<n;row++){
            for(int space=row;space>0;space--){
                System.out.print(" ");
            }
            for(int col=n;col>row;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for(int row=0;row<n;row++){
            for(int space=row;space>0;space--){
                System.out.print(" ");
            }
            for(int col=1;col<=((n-row)*2)-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        for(int row=0;row<n;row++){
            for(int space=row;space>0;space--){
                System.out.print(" ");
            }
            for(int col=1;col<=n-row;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern13(int n){
        for(int row=1;row<=n;row++){
            for(int space=n-row;space>0;space--){
                System.out.print(" ");
            }
            for(int col=1;col<=2*row-1;col++){
                if(row==1||row==n||col==1||col==2*row-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern15(int n){
        for(int row=1;row<=2*n-1;row++){
            for(int space=n-row;space>0;space--){
                System.out.print(" ");
            }
            int newRow=row;
            if(row>=n){
                newRow=n-(row-n);
                for(int space=n-newRow;space>0;space--){
                    System.out.print(" ");
                }
            }
            for(int col=1;col<=2*newRow-1;col++){
                if(row==1||col==2*newRow-1||col==1||col==2*row-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
