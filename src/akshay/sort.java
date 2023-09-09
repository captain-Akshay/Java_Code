package akshay;

import java.util.Arrays;
public class sort{
    public static void main(String []args){
        int [] arr={1,5,9,1,8,7,3,4,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {

    }

    static void bubbleSort(int [] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static int max(int []arr,int end){
        int ans=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<=end;i++){
            if(maxi<arr[i]){
                maxi=arr[i];
                ans=i;

            }
        }
        return ans;
    }
    static void selectionSort(int [] arr){
        for(int i=1;i<arr.length;i++){
                int swap=max(arr,arr.length-i);
                int temp=arr[swap];
                arr[swap]=arr[arr.length-i];
                arr[arr.length-i]=temp;
        }
    }
}
