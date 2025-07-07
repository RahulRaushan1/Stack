package A16_Stack;
import java.util.Stack;
public class A2_ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st_original = new Stack<>();
        st_original.push(1);
        st_original.push(5);
        st_original.push(10);
        st_original.push(20);
        System.out.println(st_original);
        Stack<Integer> st_Reversed = new Stack<>();
        while(!st_original.isEmpty()){
           st_Reversed.push( st_original.pop());
        }
        System.out.println(st_Reversed);
    }
}
