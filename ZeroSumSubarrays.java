package stack;
import java.util.*;
public class ZeroSumSubarrays {
    public static int count(int[] a){
        int c=0;
        for(int i=0;i<a.length;i++){
            int sum=0;
            Stack<Integer> st=new Stack<>();
            for(int j=i;j<a.length;j++){
                st.push(a[j]);
                sum+=a[j];
                if(sum==0) c++;
            }
        }
        return c;
    }
}