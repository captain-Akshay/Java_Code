package practice;
import java.io.File;
import java.lang.reflect.Array;
import java.util.*;

public class javaCollege {
    public static boolean isValidSerialization(String preorder) {
        // number of available slots
        int slots = 1;

        int n = preorder.length();
        for(int i = 0; i < n; ++i) {
            if (preorder.charAt(i) == ',') {
                // one node takes one slot
                --slots;

                // no more slots available
                if (slots < 0) return false;

                // non-empty node creates two children slots
                if (preorder.charAt(i - 1) != '#') slots += 2;
            }
        }
        slots = (preorder.charAt(n - 1) == '#') ? slots - 1 : slots + 1;
        HashSet<Integer>hs=new HashSet<>();
        return slots == 0;
    }
        public static void main(String [] args){
    }

}
