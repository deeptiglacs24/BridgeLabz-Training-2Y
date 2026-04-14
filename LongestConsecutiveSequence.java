package stack;
import java.util.*;
public class LongestConsecutiveSequence {
    public static int find(int[] a){
        Arrays.sort(a);
        int max=1,cur=1;
        for(int i=1;i<a.length;i++){
            if(a[i]==a[i-1]+1) cur++;
            else if(a[i]!=a[i-1]) cur=1;
            max=Math.max(max,cur);
        }
        return max;
    }
}