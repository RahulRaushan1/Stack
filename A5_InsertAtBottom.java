package A16_Stack;
import java.util.Stack;
public class A5_InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(5);
        st.push(10);
        st.push(20);
        int new_element = 50;
        Stack<Integer> st_temp = new Stack<>();
        while(!st.isEmpty()){
            st_temp.push(st.pop());
        }
        st.push(50);
        while(!st_temp.isEmpty()){
            st.push(st_temp.pop());
        }
        System.out.println(st);
    }
}
