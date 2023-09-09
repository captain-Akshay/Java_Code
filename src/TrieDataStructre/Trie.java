package TrieDataStructre;
class Node{
    Node[] root= new Node[26];
    boolean flag=true;
    Node() {

    }
    public boolean containsChar(char a){
        if(root[a-'a']!=null) return true;
        return false;
    }
    public Node get(char a){
        return root[a-'a'];
    }
    public void put(char a,Node node){
        root[a-'a']=node;
    }
    public void setEnd(){
        flag=true;
    }
    public boolean isEnd(){
        return flag;
    }
}

class Trie {
    private static Node root;
    public Trie() {
        root = new Node();
    }
    public void insert(String word) {
        Node node=root;
        for(int i=0;i<word.length();i++){
            if(!node.containsChar(word.charAt(i))){
                node.put(word.charAt(i),new Node());
            }
            node=node.get(word.charAt(i));
        }
        node.setEnd();
    }
    
    public boolean search(String word) {
        Node node= root;
        for(int i=0;i<word.length();i++) {
            if (node.containsChar(word.charAt(i))) {
                node = node.get(word.charAt(i));
            } else return false;
        }
        return node.isEnd();
    }

    public  boolean startsWith(String prefix) {
        Node node = root;
        for(int i = 0;i<prefix.length();i++) {
            if (!node.containsChar(prefix.charAt(i))) {
                return false;
            }
            node = node.get(prefix.charAt(i));
        }
        return true;
    }
}