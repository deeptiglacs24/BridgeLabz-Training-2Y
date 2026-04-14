package stack;
import java.util.*;
public class SortStack {
    public static void sort(Stack<Integer> s){
        if(s.isEmpty()) return;
        int x=s.pop();
        sort(s);
        insert(s,x);
    }
    static void insert(Stack<Integer> s,int x){
        if(s.isEmpty()||s.peek()<=x){s.push(x);return;}
        int t=s.pop();
        insert(s,x);
        s.push(t);
    }
}