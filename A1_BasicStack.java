package A16_Stack;
import java.util.Stack;
public class A1_BasicStack {
    public static void main(String[] args) {
       Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(5);
        st.push(10);
        st.push(20);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st);
        st.push(10);
        st.push(20);
        while(st.size() >1){
            st.pop();
        }
        // size has become 1
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        
    }
}
