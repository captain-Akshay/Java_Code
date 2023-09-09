package akshay;

import java.util.Arrays;

public class questionPractice{
    public static int subarraySum(int[] nums, int k) {
        int start=0;
        int end=nums.length;
        int sum=0;
        int count=0;
        for(int i=0;i<=nums.length;i++){
            if(nums[i]>k) continue;
            if(sum+nums[i]>k){
                if(sum==k) count++;
                sum=nums[i];
                continue;
            }
            sum+=nums[i];
            if(sum==k) {
                count++;
                sum=nums[i];
            }
        }
        return count;
    }
    public static void main(String [] args){
        int [] no={1,2,3};
        System.out.print(subarraySum(no,2));
    }

}