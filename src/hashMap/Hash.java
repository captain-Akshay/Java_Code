package hashMap;
import java.util.HashMap;
import java.util.Arrays;
import java.util.LinkedList;

class MyHashMap {
    private class  HashNode{
        int key;
        int val;
        HashNode(int key){
            this.key=key;
            this.val= Integer.parseInt(null);
        }
        HashNode(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    int size;
    LinkedList<HashNode>[]buket;
    public MyHashMap() {
        this.size=0;
        buket=new LinkedList[4];
        for(int i=0;i<4;i++) {
            buket[i] = new LinkedList<>();
        }
    }
    public void put(int key, int value) {
    int bi=hashKey(key);
    int di=check(key,bi);
    if(di!=-1){
        HashNode hn=buket[bi].get(di);
        hn.val= value;
    }else{
        HashNode newhn= new HashNode(key,value);
        buket[bi].add(newhn);
        size++;
    }
    }
    private int check(int key,int bi){
        int di=0;
        for( HashNode i:buket[bi]){
            if(i.key==(key)){
                return di;
            }
            di++;
        }
        return -1;
    }
    public int hashKey(int key){
        HashNode hn=new HashNode(key);
        System.out.println(hn.hashCode());
        return (Math.abs(hn.hashCode()) % buket.length);
    }
    public int get(int key) {
        int bi=hashKey(key);
        int di=check(key,bi);
        if(di!=-1){
            return buket[bi].get(di).val;
        }else{
            return -1;
        }
    }

    public void remove(int key) {
        int bi=hashKey(key);
        int di=check(key,bi);
        if(di!=-1){
            buket[bi].remove(di);
        }
    }
}


public class Hash {
    public static void main(String[] args) {
        MyHashMap map=new MyHashMap();
        map.hashKey(123);
    }
}
