package akshay;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int []arr={5,1,7,2,1,4,7,5};
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInPlace(int []arr,int start,int end){
        if(end - start == 1){
            return;
        }
        int mid=start+(end-start)/2;

        mergeSortInPlace(arr,start,mid);
        mergeSortInPlace(arr,mid,end);

        merge(arr,start,mid,end);
    }
    static void merge(int[]arr,int start,int mid,int end){
        int []mix=new int[end-start];
        int i=start;
        int j=mid;
        int k=0;
        while(i<mid&&j<end){
            if(arr[i]<arr[j]){
                mix[k++]=arr[i++];
            }
            else{
                mix[k++]=arr[j++];
            }
        }
        while(i<mid){
            mix[k++]=arr[i++];
        }
        while(j<end){
                mix[k++]=arr[j++];

        }
        for(int l=0;l<mix.length;l++){
            arr[start+l]=mix[l];
        }
    }
}
