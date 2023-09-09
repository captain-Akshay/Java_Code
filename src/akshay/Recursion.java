package akshay;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.List;
public class Recursion{
    public static boolean isValid(String s) {
        if(s.isEmpty()){
            return true;
        }
        Stack<Character> st=new Stack<Character>();
        int i=0;
        while(i<s.length()){

            switch (s.charAt(i)) {
                case '{', '[', '(' -> {
                    st.add(s.charAt(i));
                    i++;
                    break;
                }
                case '}', ']', ')' -> {
                    if (st.empty()) {
                        return false;
                    }

                    if (st.peek() == s.charAt(i)) {
                        st.pop();
                        i++;
                    } else return false;
                }
            }
        }
        return true;
}
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
}
