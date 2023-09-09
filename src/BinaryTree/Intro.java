package BinaryTree;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class triple{
    int level;
    int vertical;
    TreeNode root;
    triple(TreeNode root,int level,int vertical){
        this.root=root;
        this.level=level;
        this.vertical=vertical;
    }
}
public class Intro {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> hm=new TreeMap<>();
        Queue<triple> q= new LinkedList<>();
        q.add(new triple(root,0,0));
        while(!q.isEmpty()){
            triple temp=q.poll();
            TreeNode node= temp.root;
            int level= temp.level;
            int vertical=temp.vertical;
            if(!hm.containsKey(level)){
                hm.put(level,new TreeMap<>());
            }
            if(!hm.get(level).containsKey(vertical)){
                hm.get(level).put(vertical, new PriorityQueue<>());
            }
            hm.get(level).get(vertical).add(node.val);
            if(node.left!=null) q.add(new triple(node.left,level+1,vertical-1));
            if(node.right!=null) q.add(new triple(node.right,level+1,vertical+1));
        }
        for(TreeMap<Integer,PriorityQueue<Integer>> i: hm.values()){
            ans.add(new ArrayList<Integer>());
            for( PriorityQueue<Integer>s:i.values()){
                while(!s.isEmpty()) ans.get(ans.size()-1).add(s.poll());
            }
        }
        return ans;
        }
    }
