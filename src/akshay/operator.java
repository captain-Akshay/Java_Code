package akshay;

public class operator {
    public static void main(String[] args) {
    int[] arr={1,3};
    int target=3;
        System.out.println(search(arr,target));
    }
    static int search(int[] nums, int target){
        return helper(nums,target,0,nums.length-1);
    }

    static int helper(int[] nums, int target, int start, int end) {
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(nums[mid]==target) return mid;
        if(nums[start]<=nums[mid]){
            if(target>=nums[start] && target<=nums[mid]){
                return helper(nums,target,start,mid-1);
            }else{
               return helper(nums,target,mid+1,end);
            }
        }
        if(target<=nums[end] && target>=nums[mid]){
                return helper(nums,target,mid+1,end);
            }
                return helper(nums,target,start,mid-1);

    }
}
