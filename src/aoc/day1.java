package aoc;

import java.util.Arrays;
import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        String i="Input paste it here!!";
        String[]tempp=i.split("\n\n");
        for(String st:tempp){
            int temp=0;
            for (String input:st.split("\n")){
                temp+=Integer.valueOf(input);
            }
            ans=Math.max(ans,temp);
        }
        System.out.println(ans);
    }
}
