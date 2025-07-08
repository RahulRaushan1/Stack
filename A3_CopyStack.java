package A16_Stack;
import java.util.Stack;
public class A3_CopyStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(5);
        st.push(10);
        st.push(20);
        System.out.println(st);
        Stack<Integer> st_temp = new Stack<>();
        while(!st.isEmpty()){
          st_temp.push(st.pop());
        }
        Stack<Integer> st_final = new Stack<>();
        while(!st_temp.isEmpty())
        st_final.push(st_temp.pop());
        System.out.println(st_final);
    }
}
