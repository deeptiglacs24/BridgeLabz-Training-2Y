package stack;
import java.util.*;
public class StockSpan {
    public static int[] calc(int[] p){
        int n=p.length; int[] res=new int[n];
        Deque<Integer> st=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&p[st.peek()]<=p[i]) st.pop();
            res[i]=st.isEmpty()?i+1:i-st.peek();
            st.push(i);
        }
        return res;
    }
}