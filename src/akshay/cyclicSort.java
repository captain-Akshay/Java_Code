package akshay;

import java.util.ArrayList;
import java.util.List;

public class cyclicSort {
    public static void main(String []args){
     int []arr={4,3,2,7,8,2,3,1};
        List<Integer> ans=findDisappearedNumbers(arr);
    }
    static int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] < nums.length && nums[i] != i) {
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return -1;
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0;i<nums.length;i++){
            while((nums[i]-1)!=i){
                if(nums[i]!=nums[nums[i]-1]){
                    int temp=nums[i];
                    nums[i]=nums[temp-1];
                    nums[temp-1]=temp;
                }else{
                    break;
                }
            }
        }
        List <Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1!=i){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
