package stack;
import java.util.*;
public class PairWithGivenSum {
    public static boolean find(int[] a,int t){
        Stack<Integer> st=new Stack<>();
        for(int x:a){
            for(int y:st) if(x+y==t) return true;
            st.push(x);
        }
        return false;
    }
}