package akshay;

import java.util.ArrayList;
import java.util.List;
public class recursionPractice {
    public static void fibRec(int prev,int curr,int n){
        if(n==0) return;
        System.out.print(prev+curr+" ");
        fibRec(curr,prev+curr,n-1);
    }
    public static void fib(int n){
        int prev=0;
        int curr=1;
        if(n==1) System.out.print(prev);
        else if (n==2)System.out.print(prev+" "+curr);
        else {
            System.out.print(prev + " " + curr+" ");
            for (int i = 0; i < n - 2; i++) {
                int temp = curr;
                curr = curr + prev;
                prev = temp;
                System.out.print(curr+" ");
            }
        }
        System.out.println();
    }
    public static void main(String [] args){
        System.out.println("Without Recurrsion: ");
        fib(10);
        System.out.println("With Recurrsion: ");fibRec(0,1,10);
    }
    static String skipChar(String up,String p){
        if(up==""){
            return p;
        }
        char current=up.charAt(0);
        if(current=='x'){
            return skipChar(up.substring(1),p);
        }
        return skipChar(up.substring(1),p+current);
    }
    static ArrayList<String> subSequence(String up,String p){
        if(up==""){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list=new ArrayList<>();
        char current=up.charAt(0);
        list.addAll(subSequence(up.substring(1),p+current));
        list.addAll(subSequence(up.substring(1),p));
        return list;
    }
    static void permutation(String up,String p){
        if(up==""){
            System.out.println(p);
            return;
        }
        for(int i=0;i<=p.length();i++){
            char ch=up.charAt(0);
            String ans=p.substring(0,i)+ch+p.substring(i,p.length());
            permutation(up.substring(1),ans);
        }
    }
    static public List<String> letterCombinations(String digits) {
            return helper(digits,"");
    }
    static List<String> helper(String digits,String ans){
        if(digits==""){
            List<String> letter= new ArrayList<>();
            letter.add(ans);
            return letter;
        }
        List<String> letter= new ArrayList<>();
        int dig= digits.charAt(0)-'0';
        if(dig==7){
            for(int i=(dig-2)*3;i<=(dig-1)*3;i++){
                char cur=(char)('a'+i);
                letter.addAll(helper(digits.substring(1),ans+cur));
            }
        }
        else if(dig==8){
            for(int i=((dig-2)*3)+1;i<=(dig-1)*3;i++){
                char ch=(char)('a'+i);
                letter.addAll(helper(digits.substring(1),ans+ch));
            }
        }
        else if(dig==9){
            for(int i=((dig-2)*3)+1;i<=((dig-1)*3)+1;i++){
                char ch=(char)('a'+i);
                letter.addAll(helper(digits.substring(1),ans+ch));
            }
        }
        else{
            for(int i=(dig-2)*3;i<(dig-1)*3;i++){
                char ch=(char)('a'+i);
                letter.addAll(helper(digits.substring(1),ans+ch));
            }
        }
        return letter;
    }
}
