package aoc;

import java.util.PriorityQueue;
import java.util.Scanner;

public class day1pt2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        String i="Input paster HERE!!";
        String[]tempp=i.split("\n\n");
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        for(String st:tempp){
            int temp=0;
            for (String input:st.split("\n")){
                temp+=Integer.valueOf(input);
            }
            pq.add(temp);
        }
        System.out.println(pq.poll()+pq.poll()+pq.poll());
    }
}
