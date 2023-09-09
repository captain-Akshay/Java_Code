package akshay;

import java.util.*;

public class slidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer> dq=new ArrayDeque<>();
        int []ans=new int[n-k+1];
        int ansInd=0;
        for(int i=0;i<n;i++){
            if(!dq.isEmpty() && dq.peek()==i-k){
                dq.poll();
            }
            while(!dq.isEmpty()&&nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }
            dq.offer(i);
            if(i>=k-1) {
                ans[ansInd++] = nums[dq.peek()];
            }
        }
        return ans;
    }
    public static int orangesRotting(int[][] grid) {
        int counttotal=0;
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]> qu=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    qu.add(new int[]{i,j});
                }
                if(grid[i][j]!=0){
                    counttotal++;
                }
            }
        }
        int count=0;
        int check=0;
        int []dirx={0,0,1,-1};
        int []diry={1,-1,0,0};
        while(!qu.isEmpty()){
            int [] curr=qu.peek();
            int size=qu.size();
            check+=size;
            for(int i=0;i<4;i++){
                int x=curr[0]+dirx[i];
                int y=curr[1]+diry[i];
                if(x<0||y<0||grid[x][y]==0||grid[x][y]==2) continue;
                grid[x][y]=2;
                qu.add(new int []{x,y});
            }
            if(!qu.isEmpty()) count++;
        }
        return counttotal==check?counttotal:-1;
    }
    public static void main(String[] args) {
    int[][] nums= {{2,1,1},{1,1,0},{0,1,1}};
    int k=3;
    System.out.print(orangesRotting(nums));
    }
}
