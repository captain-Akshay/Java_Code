package Disjoint;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.StringBuilder;
import java.util.TreeMap;

class DSU {
    ArrayList<Integer> size,parent;
    DSU(int n){
        size=new ArrayList<Integer>();
        parent=new ArrayList<Integer>();
        for(int i=0;i<=n;i++){
            this.size.add(1);
            this.parent.add(i);
        }
    }
    public int findParent(int node){
        if(parent.get(node)==node)return node;
        int temp=findParent(parent.get(node));
        parent.set(node,temp);
        return parent.get(node);
    }
    public void union(int u,int v){
        int parent_u=findParent(u);
        int parent_v=findParent(v);
        if(parent_v==parent_u)return;
        if(size.get(parent_v)<size.get(parent_u)){
            parent.set(parent_v,parent_u);
            size.set(parent_u,size.get(parent_v)+size.get(parent_u));
        }else{
            parent.set(parent_u,parent_v);
            size.set(parent_v,size.get(parent_v)+size.get(parent_u));
        }
    }
}
