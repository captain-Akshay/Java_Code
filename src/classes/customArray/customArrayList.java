package classes.customArray;

import java.util.Arrays;

class customArrayList {
    int size;
    int [] arr;
    int currentSize;
    customArrayList(){
        currentSize=0;
        size=10;
        arr=new int[size];
        System.out.println("List Created!!");
    }
    private void upgrade(){
        System.out.println("List full!!");
    }
    void add(int a){
        if(size==currentSize){
            upgrade();
            return;
        }
        arr[currentSize++]=a;
    }
    public String toString(){
        System.out.println(Arrays.toString(arr));
        return (Arrays.toString(arr));
    }

}
